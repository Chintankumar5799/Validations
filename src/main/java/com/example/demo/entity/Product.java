package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private int quantity;
	
	@ManyToMany(mappedBy = "product")
	private List<Person> person;
	
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
	
//	public Product(int productId, String productName, int quantity, Person person) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.quantity = quantity;
//		this.person = person;
//	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", person=" + person + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	public Product(int productId, String productName, int quantity, List<Person> person) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.person = person;
	}
	

}
