package com.hidden.shop.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hidden.shop.entity.Avis;
import com.hidden.shop.entity.Shops;
import com.hidden.shop.security.UserAuthentication;
import com.hidden.shop.service.IShopsService;
 

@RestController
@RequestMapping("/shops")
public class ShopsController {

	@Autowired
	private IShopsService ShopsService;
	
	
	/*@RequestMapping(value = "byName/{name}", method = RequestMethod.GET) 
	public ResponseEntity<Shops> getShopsById(@PathVariable("name") String name) throws Exception {

		Shops Shops = ShopsService.getShopsByName(name);
		System.out.println("test");
		return new ResponseEntity<Shops>(Shops, HttpStatus.FOUND);

	}*/
	@RequestMapping( method = RequestMethod.GET) 
	public ResponseEntity<List<Shops>> getShops() throws Exception {
		List<Shops> Shops = ShopsService.findAll();
		//System.out.println(Shops.get(0).getAvislist_ids());
		return new ResponseEntity<List<Shops>>(Shops, HttpStatus.FOUND);
  
	}
	@RequestMapping( value = "liked/{id}",method = RequestMethod.GET) 
	public ResponseEntity<Avis> avisLikeShopes(@PathVariable("id") ObjectId _id) throws Exception {
		Avis avisLiked = ShopsService.addLikeShop(_id);
		
		//UserAuthentication currentUser = (UserAuthentication) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		//System.out.println(currentUser.getName());
		return new ResponseEntity<Avis>(avisLiked, HttpStatus.FOUND);
  
	}
}
