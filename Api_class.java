package com.sachin.springboot.curd.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api_class {

	@Autowired
	SessionFactory sf;
	
	
	@GetMapping("select/{id}")
	public Student show_single(@PathVariable int id) {
		Session ss=sf.openSession();
		Student s=ss.get(Student.class, id);
		return s;
	}
	
	@PostMapping("insert")
	public Student insert(@RequestBody Student student) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.save(student);
		System.out.println("Data inserted succesfully ");
		ts.commit();
		System.out.println(student);
		return student;
	}
	
	@PostMapping("update")
	public Student update(@RequestBody Student student) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.update(student);
		System.out.println("Data update succesfully ");
		ts.commit();
		System.out.println(student);
		return student;
	}
	
	@DeleteMapping("delete")
	public Student delete(@RequestBody Student student) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.delete(student);
		ts.commit();
		System.out.println("Data deleted Succesfully");
		return student;
	}
	
	
	@DeleteMapping("deletep/{id}")
	public  Session deletep(@PathVariable int id) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.delete(id);
		ts.commit();
		System.out.println("Data deleted Succesfully");
		return ss;
	}
}