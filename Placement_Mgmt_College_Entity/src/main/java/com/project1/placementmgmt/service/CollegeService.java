package com.project1.placementmgmt.service;

import java.util.List;

import com.project1.placementmgmt.entity.College;

public interface CollegeService {

	public College saveCollege(College college);

	public List<College> fetchCollegeList();

	public College fetchCollegeById(Long id);

	public void deleteCollegeById(Long id);

	public College updateCollege(Long id, College college);

}
