package com.project.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
