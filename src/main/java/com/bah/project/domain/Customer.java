package com.bah.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	//  Workshop:
	//
	//  Make a concrete implementation of a customer domain.  What attributes do you need for
	//  Customer?  At the least, you need to be able to uniquely identify instances of Customer.
	//  Customers have user names, passwords, and email addresses - how would you implement that? 
	//
	//  You may find your implementation changes over time; a simple in-memory implementation 
	//  may be replaced by a robust implementation that makes use of a relational database
	//  as its persistent store, or you may choose some other mechanism.  In thinking about 
	//  how you implement the customer domain, what do you think about to make it easier and 
	//  safer to move from one representation to another.	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="CUSTOMER_NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
