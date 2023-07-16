package com.springboot.app.sms.service;

import java.util.List;

import com.springboot.app.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudent(Long id);
	
}
