package com.project.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.crud.entity.Student;
import com.project.crud.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id")  Long id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteById(@PathVariable("id")  Long id) {
		studentService.deleteById(id);
		return "Student deleted Successfully!!";
	}

	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		//TODO: process PUT request
		
		return studentService.updateStudent(id,student);
	}

}
