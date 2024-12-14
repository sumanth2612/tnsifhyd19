package com.placement.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.Placement;
import com.placement.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService {

	@Autowired
	PlacementRepository placementRepository;
	
	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return placementRepository.save(placement);
	}

	@Override
	public List<Placement> fetchAllPlacements() {
		// TODO Auto-generated method stub
		return placementRepository.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return placementRepository.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		placementRepository.deleteById(id);
	}

	@Override
	public Placement updatePlacementById(Long id, Placement placement) {
		// TODO Auto-generated method stub
		Placement pdb=placementRepository.findById(id).get();
		
		if(Objects.nonNull(placement.getPlacementName()) &&  !"".equalsIgnoreCase(placement.getPlacementName())) {
	           pdb.setPlacementName(placement.getPlacementName());
		}
		if(Objects.nonNull(placement.getPlacementQualification()) &&  !"".equalsIgnoreCase(placement.getPlacementQualification())) {
	           pdb.setPlacementQualification(placement.getPlacementQualification());
		}
		if(Objects.nonNull(placement.getPlacementYear()) &&  !"".equalsIgnoreCase(placement.getPlacementYear())) {
	           pdb.setPlacementYear(placement.getPlacementYear());
		}
		return placementRepository.save(pdb);
	}

}
