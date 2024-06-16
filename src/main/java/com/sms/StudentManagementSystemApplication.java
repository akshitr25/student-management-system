package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public void run(String... args) throws Exception
	{
//		Student std1=new Student("Akshit","Rathod","akshitrathod1025@gmail.com");
//		studentRepo.save(std1);
//		Student std2=new Student("Cody","Rhodes","americancody@gmail.com");
//		studentRepo.save(std2);
//		Student std3=new Student("Drew","McIntyre","drewgalloway@gmail.com");
//		studentRepo.save(std3);
	}
}
