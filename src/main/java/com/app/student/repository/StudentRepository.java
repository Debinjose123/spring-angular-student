package com.app.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	

}
