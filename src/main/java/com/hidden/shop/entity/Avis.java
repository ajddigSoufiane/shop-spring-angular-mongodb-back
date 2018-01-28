package com.hidden.shop.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "avis")
public class Avis {
	  @Id
	  private ObjectId _id_avis; 
	  private boolean liked;
	  @DBRef 
	  private User user_id;
	  @DBRef 
	  private Shops shop_id;
	 
	  
 
	public Avis( boolean liked, User user_id, Shops shop_id) {
		super();
		this.liked = liked;
		this.user_id = user_id;
		this.shop_id = shop_id;
	}

	public ObjectId get_id_avis() {
		return _id_avis;
	}

	public void set_id_avis(ObjectId _id_avis) {
		this._id_avis = _id_avis;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Shops getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shops shop_id) {
		this.shop_id = shop_id;
	}

	
	
}
