package com.persistent.semicolon.UseCase_Service2.controller;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.persistent.semicolon.UseCase_Service2.model.UseCase;
import com.persistent.semicolon.UseCase_Service2.repository.UseCaseRepository;

@Controller
public class UseCaseController {


	@Autowired
	UseCaseRepository repo;

	@GetMapping("/upload")
	public String uploading() {
		return "success";
	}


	@PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile mFile) throws IOException {

		
		ArrayList<UseCase> tempUsecaseList = new ArrayList<UseCase>();
		XSSFWorkbook workbook = new XSSFWorkbook(mFile.getInputStream());
		XSSFSheet worksheet = workbook.getSheetAt(0);

		for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
			UseCase tempUseCase = new UseCase();

			XSSFRow row = worksheet.getRow(i);

			tempUseCase.setUseCaseId((long) row.getCell(0).getNumericCellValue());
			tempUseCase.setUsecaseTitle(row.getCell(1).getStringCellValue());
			tempUseCase.setUsecaseDescription(row.getCell(2).getStringCellValue());
			tempUsecaseList.add(tempUseCase);

		}
 
		System.out.println("Temp Use case list:" + tempUsecaseList);

		for (UseCase u : tempUsecaseList)
			repo.save(u);

		System.out.println("saved data in db ");

		workbook.close();
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}

}
