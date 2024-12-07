package com.project1.placementmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.placementmgmt.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long>{

}
