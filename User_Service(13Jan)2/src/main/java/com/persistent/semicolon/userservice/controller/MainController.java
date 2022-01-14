package com.persistent.semicolon.userservice.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import com.persistent.semicolon.userservice.model.Mail;
import com.persistent.semicolon.userservice.model.User;
import com.persistent.semicolon.userservice.model.UserList;
import com.persistent.semicolon.userservice.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	private UserRepository repo;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@GetMapping("/user")
	public String user() {
		return "user";
	}

	// for Email Service

	@GetMapping("/sendRequest")
	public ResponseEntity<String> goToEmailService() {
		RestTemplate restTemplate = new RestTemplate();

		Mail mail = restTemplate.getForObject("http://localhost:9003/mailrequest", Mail.class);

		if (mail == null) {
			return new ResponseEntity<String>(" Mail sending failed!!!", HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<String>(" Mail sent Successfully!!!", HttpStatus.OK);
		}
	}

	// For UseCase service

	@PostMapping("/uploadusecase")
	public ResponseEntity<String> mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile)
			throws IOException 
	{
		Resource UseCaseResource = reapExcelDataFile.getResource();
		String url = "http://localhost:9002/uploadFile";
		
		LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
		parts.add("file", UseCaseResource);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, Object>> httpEntity = new HttpEntity<>(parts, httpHeaders);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForEntity(url, httpEntity, String.class);
		return new ResponseEntity<String>("File Data Stored in DB successfully...", HttpStatus.OK);

	}

	// For TeamService

	@GetMapping("/alluser")
	public UserList getAllUsers() {
		List<User> l = repo.findAll();
		UserList users = new UserList();
		users.setuList((ArrayList<User>) l);
		return users;
	}

}
