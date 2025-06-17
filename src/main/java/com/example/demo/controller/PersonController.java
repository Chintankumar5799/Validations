package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonDTO;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.Person;
import com.example.demo.entity.Product;
import com.example.demo.repo.PersonRepo;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService ser;
	
//	@Autowired
//	private Person personEntity;
	
	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@GetMapping("/")
	public String greet() {
		return "Hello...Chintan";
	}

	@PostMapping("/validate")
	public String validate(@RequestParam String name) {
		if(name.equals("chintan")) {
			return "Name is valid";
		}else {
			return "Incorrect name";
		}
	}
	

	
//	//------ @Many to Many Bidirectional
	@PostMapping(value="/orm", consumes = "application/json", produces = "text/plain")
	public String addUser(@RequestBody PersonDTO personRequest) {
		Person person=new Person();
		person.setId(personRequest.getId());
		person.setName(personRequest.getName());
		System.out.println(personRequest.getName());
		
		List<Product> productList=new ArrayList<>();
		
		for(Product productDTO:personRequest.getProduct()) {
			Product product=new Product();
			
			System.out.println(productDTO);
			product.setProductName(productDTO.getProductName());
			product.setProductId(productDTO.getProductId());
			product.setQuantity(productDTO.getQuantity());
			
			productList.add(product);
			System.out.println(productDTO.getProductName()+" "+productDTO.getProductId()+" "+productDTO.getQuantity());
		}
		person.setProduct(productList);
		personRepo.save(person);
		
		return "User is created";
	}
//	
//	//----- @Many to One Bidirectional
//	@PostMapping(value="/orm",consumes = "application/json",produces = "text/plain")
//	public String addUser(@RequestBody Person personRequest) {
//
//	    for (Product product : personRequest.getProduct()) {
//	        // Initialize the product's person list if null
//	        if (product.getPerson() == null) {
//	            product.setPerson(new ArrayList<>());
//	        }
//
//	        // Add the current person to the product's person list
//	        product.getPerson().add(personRequest);
//	    }
//
//	    personRepo.save(personRequest); // JPA handles the join table
//	    return "User is created";
//	}

	
	@PostMapping("/validateEntity")
	public String validate(@Valid @ModelAttribute Contact contact) {
		ser.saveDetails(contact);
		return contact.getName()+ " "+contact.getMobileNum()+" "+contact.getEmail();
	}
}
