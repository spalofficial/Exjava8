package com.souvik.java8_03;

public class Employee{
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		this.id = "Anonymous";
		this.name = "Anonymous";

		System.out.println("Default Employee Called");
	}
	
	
}