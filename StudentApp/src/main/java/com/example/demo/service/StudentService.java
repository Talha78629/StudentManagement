package com.example.demo.service;

import java.util.List;


import com.example.demo.model.*;


public interface StudentService {

	List<Student> getallstudents();
	
	Student createstudent(Student student);
	
	Student getbyId(int id);
	
	void updatestudent(Student student, int id );
	
	void deletestudent(int id);
	
}
