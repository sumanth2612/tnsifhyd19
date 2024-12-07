package com.project1.placementmgmt.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.placementmgmt.entity.College;
import com.project1.placementmgmt.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	private CollegeRepository collegeRepository;
	
	@Override
	public College saveCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> fetchCollegeList() {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public College fetchCollegeById(Long id) {
		// TODO Auto-generated method stub
		return collegeRepository.findById(id).get();
	}

	@Override
	public void deleteCollegeById(Long id) {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(id);
	}

	@Override
	public College updateCollege(Long id, College college) {
		// TODO Auto-generated method stub
		College colDB=collegeRepository.findById(id).get();
		
		if(Objects.nonNull(college.getCollegeName()) &&  !"".equalsIgnoreCase(college.getCollegeName())) {
	           colDB.setCollegeName(college.getCollegeName());
		}
		
		 if(Objects.nonNull(college.getLocation()) &&
	               !"".equalsIgnoreCase(college.getLocation())) {
	           colDB.setLocation(college.getLocation());
	       }

	      
		return collegeRepository.save(colDB);
	}

}
