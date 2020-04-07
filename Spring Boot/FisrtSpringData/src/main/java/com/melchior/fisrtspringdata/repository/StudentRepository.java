package com.melchior.fisrtspringdata.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.melchior.fisrtspringdata.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	
	public List<Student> findByNameLikeIgnoreCase(String name);
}
