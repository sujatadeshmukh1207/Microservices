package com.persistent.semicolon.email_service.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.persistent.semicolon.email_service.model.Mail;
import com.persistent.semicolon.email_service.service.MailService;

@RestController
public class EmailController {
	
	@Autowired
	private MailService mailservice;
	
	@GetMapping("/mailrequest")
    public Mail sendingmail() {
		
		Mail mail = new Mail();
        mail.setMailFrom("sujatadeshmukh1207@gmail.com");
        mail.setMailTo("shubhangi.dhumal1@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\n");
 
		mailservice.sendEmail(mail);
		
		return mail;
    }
}
