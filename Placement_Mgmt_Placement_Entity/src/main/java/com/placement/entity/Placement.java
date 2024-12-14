package com.placement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long placementId;
	private String placementName;
	private String placementQualification;
	private String placementYear;
	
	public long getPlacementId() {
		return placementId;
	}
	public void setPlacementId(long placementId) {
		this.placementId = placementId;
	}
	public String getPlacementName() {
		return placementName;
	}
	public void setPlacementName(String placementName) {
		this.placementName = placementName;
	}
	public String getPlacementQualification() {
		return placementQualification;
	}
	public void setPlacementQualification(String placementQualification) {
		this.placementQualification = placementQualification;
	}
	public String getPlacementYear() {
		return placementYear;
	}
	public void setPlacementYear(String placementYear) {
		this.placementYear = placementYear;
	}
	
	public Placement() {
		super();
	}
	
	public Placement(long placementId, String placementName, String placementQualification, String placementYear) {
		
		this.placementId = placementId;
		this.placementName = placementName;
		this.placementQualification = placementQualification;
		this.placementYear = placementYear;
	}
	@Override
	public String toString() {
		return "Placement [placementId=" + placementId + ", placementName=" + placementName
				+ ", placementQualification=" + placementQualification + ", placementYear=" + placementYear + "]";
	}
	
	
	
	
}
