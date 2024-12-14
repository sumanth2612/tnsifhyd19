package com.placement.service;

import java.util.List;

import com.placement.entity.Placement;

public interface PlacementService {

	Placement savePlacement(Placement placement);

	List<Placement> fetchAllPlacements();

	Placement fetchPlacementById(Long id);

	void deletePlacementById(Long id);

	Placement updatePlacementById(Long id, Placement placement);

}
