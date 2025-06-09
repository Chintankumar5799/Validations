package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="person_product",joinColumns=@JoinColumn(name="person_id"),
	inverseJoinColumns=@JoinColumn(name="product_product_id"))
	
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

	public Person(int id, String name,List<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
