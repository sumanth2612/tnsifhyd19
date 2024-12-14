package com.project.crud.service;

import java.util.List;

import com.project.crud.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(Long id);

	void deleteById(Long id);

	Student updateStudent(Long id, Student student);

}
