package com.project1.placementmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project1.placementmgmt.entity.College;
import com.project1.placementmgmt.service.CollegeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/colleges")
	public College saveCollege(@RequestBody College college) {
		//TODO: process POST request
		
		return collegeService.saveCollege(college);
	}
	
	@GetMapping("/colleges")
	public List<College> fetchCollegeList() {
		return collegeService.fetchCollegeList();
	}
	
	@GetMapping("/colleges/{id}")
	public College fetchCollegeById(@PathVariable("id") Long id) {
		return collegeService.fetchCollegeById(id);
	}
	
	@DeleteMapping("/colleges/{id}")
	public String deleteCollegeById(@PathVariable("id") Long id) {
		collegeService.deleteCollegeById(id);
		return "College deleted Successfully!!";
	
	}
	
	@PutMapping("/colleges/{id}")
	public College updateCollege(@PathVariable("id") Long id, @RequestBody College college) {
		//TODO: process PUT request
		
		return collegeService.updateCollege(id,college);
	}
}
