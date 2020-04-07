package com.melchior.fisrtspringdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.melchior.fisrtspringdata.entity.Student;
import com.melchior.fisrtspringdata.repository.StudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentsRepository;
	
	@GetMapping("/student")
	public List<Student> listStudent(){
		return this.studentsRepository.findAll();
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return this.studentsRepository.save(student);
	}
	
	@GetMapping("/student/{id}")
	public Student listStudentId(@PathVariable("id") String id) {
		return this.studentsRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/student/{name}/name")
	public List<Student> findStudentByName(@PathVariable String name){
		return this.studentsRepository.findByNameLikeIgnoreCase(name);
	}

}
