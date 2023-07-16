package com.springboot.app.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.app.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Harish","Radhakrishnan","harish@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Aishu","Harish","aishu@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("pattu","kutty","pattukutty@gmail.com");
//		studentRepository.save(student3);
		
	}

}
