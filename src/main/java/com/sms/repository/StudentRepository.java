package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
}
