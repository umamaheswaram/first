package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ComApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ComApplication.class, args);
		System.out.println("Hello");
	}

}
