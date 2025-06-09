package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.demo.entity.Contact;

@Service
//@SessionScope
//@ApplicationScope
public class PersonService {
	
	public PersonService(){
		System.out.println("Service bean is generated");
	}

	public void saveDetails(@Valid Contact contact) {
		System.out.println("Message is saved");
		
	}

}
