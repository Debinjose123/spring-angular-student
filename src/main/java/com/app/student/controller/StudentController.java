package com.app.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.student.model.Student;
import com.app.student.service.StudentService;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student)
	{
		return studentService.registerStudent(student);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return studentService.getStudents();
		
	}
}
