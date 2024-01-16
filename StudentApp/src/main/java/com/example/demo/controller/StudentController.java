package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentservice;
	
	@PostMapping("/createstudent")
	public Student createstudent(@RequestBody Student student) {
		
		return studentservice.createstudent(student);
	
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentservice.getallstudents();
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentbyid(@PathVariable int id) {
		return studentservice.getbyId(id);
	}
	
	
	@PutMapping("/update/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable int id) {
		 studentservice.updatestudent(student,id);
	}
@DeleteMapping("/delete/{id}")
public void deletebyid(@PathVariable int id) {
	studentservice.deletestudent(id);
}
}
