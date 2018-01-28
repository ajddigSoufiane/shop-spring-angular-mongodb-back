package com.hidden.shop.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.hidden.shop.entity.Avis;
import com.hidden.shop.entity.Shops;

public interface IShopsService {
	public Shops getShopsByName(String ShopsName);
	public List<Shops> findAll();
	public Avis addLikeShop(ObjectId _id);
	public Shops getShopById(ObjectId _id);
}
