package com.jaskaran.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaskaran.student.models.Student;
import com.jaskaran.student.repositories.StudentReposiotry;

@Service
public class StudentService {
	
	@Autowired
	private StudentReposiotry studentRepo;
	
	public Student create(Student student)
	{
		return studentRepo.save(student);
	}
	
	public List<Student> all()
	{
		return studentRepo.findAll();
	}
}
