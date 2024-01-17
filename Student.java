package com.sachin.springboot.curd.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int id;
	String name;
	String branch;
	int number;
	
	
	
	



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int id, String name, String branch, int number) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.number = number;
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



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", number=" + number + "]";
	}
	
	
	
	
	

}
