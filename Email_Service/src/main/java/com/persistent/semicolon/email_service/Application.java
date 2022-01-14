package com.persistent.semicolon.email_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//import com.persistent.semicolon.email_service.model.Mail;
//import com.persistent.semicolon.email_service.service.MailService;

@SpringBootApplication
@EnableEurekaClient
public class Application{

    public static void main(String[] args) {
        
       SpringApplication.run(Application.class, args);
       //MailService mailService = (MailService) ctx.getBean("mailService");
      // mailService.sendEmail(mail);
 
	}
}