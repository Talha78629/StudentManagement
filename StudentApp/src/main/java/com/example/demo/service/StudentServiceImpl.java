package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	
@Autowired
	private StudentRepository studentrepo;
	@Override
	public List<Student> getallstudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student createstudent(Student student) {
return studentrepo.save(student);		
	}

	@Override
	public Student getbyId(int id) {
		// TODO Auto-generated method stub
		
		Optional<Student>getbyid=studentrepo.findById(id);
		if(getbyid.isPresent()) {
			return getbyid.get();
		}
		return null;
	}

	@Override
	public void updatestudent(Student student,int id) {
		
		Optional<Student>st=studentrepo.findById(id);
if(st.isPresent()) {
	Student stu=st.get();
	stu.setName(student.getName());
	stu.setBranch(student.getBranch());
	stu.setCity(student.getCity());
	studentrepo.save(stu);
}

}



	
	@Override
	public void deletestudent(int id) {
studentrepo.deleteById(id);		
	}

}
