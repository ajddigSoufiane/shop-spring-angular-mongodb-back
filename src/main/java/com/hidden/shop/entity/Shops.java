package com.hidden.shop.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "shops")
public class Shops {
	  @Id
	  private ObjectId _id; 
	  private String picture; 
	  private String name;
	  private String email;
	  private String city;
	  private Location location;
	 /* @DBRef
	  private List<Avis> avislist_ids;*/
	   
	 
	public Shops( String picture, String name, String email, String city, Location location) {
		super();
		this.picture = picture;
		this.name = name;
		this.email = email;
		this.city = city;
		this.location = location;
		//this.avislist_ids = avislist_ids;
	}
	/*public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public ObjectId get_id() {
			return _id;
	}
	public void set_id(ObjectId _id) {
			this._id = _id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/*public List<Avis> getAvislist_ids() {
		return avislist_ids;
	}
	public void setAvislist_ids(List<Avis> avislist_ids) {
		this.avislist_ids = avislist_ids;
	} */ 
	  
}
