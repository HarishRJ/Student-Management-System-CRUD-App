package com.springboot.app.sms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	
}
