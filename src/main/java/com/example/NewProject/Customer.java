package com.example.NewProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(value="prototype")
@Component
public class Customer {
	private int id;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;
	
	public Customer() {
		super();
		System.out.println("In constructor, Object created");
	}
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("In show method...");
		laptop.compile();
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}