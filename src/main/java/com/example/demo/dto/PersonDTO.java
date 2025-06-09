package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Product;

public class PersonDTO {
	private int id;
	private String name;
	private List<Product> product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
