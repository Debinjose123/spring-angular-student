package com.app.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.student.model.Student;
import com.app.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	public Student registerStudent(Student student)
	{
		return studentRepository.save(student);
	}
	public List<Student> getStudents()
	{ 
		return (List<Student>) studentRepository.findAll();
	
		
	}

}
