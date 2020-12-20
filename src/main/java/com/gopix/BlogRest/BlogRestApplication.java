package com.gopix.BlogRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //annotation to the class to make it a Spring Boot application. You can now run the application.
@EnableSwagger2 //swagger annotation

public class BlogRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogRestApplication.class, args);
	}

}
