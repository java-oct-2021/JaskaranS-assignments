package com.jaskaran.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaskaran.student.models.Student;

@Repository
public interface StudentReposiotry extends CrudRepository<Student, Long>
{	
	List<Student> findAll();
}
