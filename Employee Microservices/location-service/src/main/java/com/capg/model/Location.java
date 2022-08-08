package com.capg.model;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(value="location")
public class Location {

	@Id
	private int locationId;
	private String locationName;
	public Location(int locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}
	public Location() {
		super();
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
}
