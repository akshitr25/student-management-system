package com.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepo;
	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		studentRepo.save(student);
		return null;
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
	}
}
