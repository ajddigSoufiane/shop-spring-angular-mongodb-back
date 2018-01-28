package com.hidden.shop.service.Imp;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hidden.shop.dao.IAvisRepository;
import com.hidden.shop.dao.IShopsRepository;
import com.hidden.shop.dao.UserRepository;
import com.hidden.shop.entity.Avis;
import com.hidden.shop.entity.Shops;
import com.hidden.shop.entity.User;
import com.hidden.shop.service.IShopsService;

@Service(value = "shopsService")
public class ShopsServiceImpl implements IShopsService {
	@Autowired
	private IShopsRepository shopsRepository;
	@Autowired
    UserRepository userRepos;
	@Autowired
    IAvisRepository avisRepos;
	
	@Override
	public Shops getShopsByName(String name) {
		// TODO Auto-generated method stub
		
		return this.shopsRepository.findFirstByName(name);
	}

	@Override
	public List<Shops> findAll() {
		// TODO Auto-generated method stub
		return this.shopsRepository.findAll();
	}

	@Override
	public Avis addLikeShop(ObjectId _id) {
		// TODO Auto-generated method stub
		 User user=userRepos.findByName("ajddig9"); 
	     Shops shop=shopsRepository.findFirstBy_id(_id);
	     Avis addAvis=new Avis(true, user, shop);
	     return this.avisRepos.save(addAvis);
	}

	@Override
	public Shops getShopById(ObjectId _id) {
		// TODO Auto-generated method stub
		 return  this.shopsRepository.findFirstBy_id(_id);
	}
 
}
