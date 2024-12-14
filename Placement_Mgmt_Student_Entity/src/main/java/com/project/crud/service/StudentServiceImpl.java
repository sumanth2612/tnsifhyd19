package com.project.crud.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crud.entity.Student;
import com.project.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		Student studDB=studentRepository.findById(id).get();
		
		if(Objects.nonNull(student.getName()) && !"".equalsIgnoreCase(student.getName())) {
			studDB.setName(student.getName());
		}
		
		if(Objects.nonNull(student.getBranch()) && !"".equalsIgnoreCase(student.getBranch())) {
			studDB.setBranch(student.getBranch());
		}
		
		if(Objects.nonNull(student.getCollege()) && !"".equalsIgnoreCase(student.getCollege())) {
			studDB.setCollege(student.getCollege());
		}
		
		return studentRepository.save(studDB);
	}

}
