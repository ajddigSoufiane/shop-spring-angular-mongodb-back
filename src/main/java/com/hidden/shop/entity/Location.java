package com.hidden.shop.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class Location {
	String type;
    float coordinates[];
    
	public Location(String type, float[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(float[] coordinates) {
		this.coordinates = coordinates;
	}
    
}
