package com.persistent.semicolon.UseCase_Service2;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class UseCaseService2Application {

	public static void main(String[] args) {
		SpringApplication.run(UseCaseService2Application.class, args);
	}

}
