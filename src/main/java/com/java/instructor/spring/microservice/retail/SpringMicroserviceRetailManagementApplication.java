package com.java.instructor.spring.microservice.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMicroserviceRetailManagementApplication {

	public static void main(String[] args) {
		System.setProperty("hadoop.home.dir", "full path to the folder with winutils");
		SpringApplication.run(SpringMicroserviceRetailManagementApplication.class, args);
	}

}
