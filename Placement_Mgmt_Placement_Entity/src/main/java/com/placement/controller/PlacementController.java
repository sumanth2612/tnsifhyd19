package com.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.placement.entity.Placement;
import com.placement.service.PlacementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@Controller
public class PlacementController {
	
	@Autowired
	PlacementService placementService;
	
	@PostMapping("/placements")
	public Placement savePlacement(@RequestBody Placement placement) {
		//TODO: process POST request
		
		return placementService.savePlacement(placement);
	}
	
	@GetMapping("/placements")
	public List<Placement> fetchAllPlacements() {
		return placementService.fetchAllPlacements();
	}
	
	@GetMapping("/placements/{id}")
	public Placement fetchPlacementById(@PathVariable("id") Long id) {
		return placementService.fetchPlacementById(id);
	}
	
	@DeleteMapping("/placements/{id}")
	public String deletePlacementById(@PathVariable("id") Long id) {
		placementService.deletePlacementById(id);
		return "Placement deleted Successfully!!";
		
	}
	
	@PutMapping("/placements/{id}")
	public Placement updatePlacementById(@PathVariable("id") Long id, @RequestBody Placement placement) {
		//TODO: process PUT request
		
		return placementService.updatePlacementById(id,placement);
	}
	
		
}
