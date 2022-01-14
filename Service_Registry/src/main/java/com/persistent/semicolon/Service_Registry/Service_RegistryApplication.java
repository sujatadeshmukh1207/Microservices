package com.persistent.semicolon.Service_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Service_RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service_RegistryApplication.class, args);
	}

}
