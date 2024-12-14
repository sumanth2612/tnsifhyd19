package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {

}
