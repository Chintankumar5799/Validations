package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo") 
public class Demo1Application 
{

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("Hello ");
			
	}

}
