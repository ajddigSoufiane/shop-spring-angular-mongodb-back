package com.hidden.shop.dao;

import org.bson.types.ObjectId; 
import org.springframework.data.mongodb.repository.MongoRepository;
import com.hidden.shop.entity.Shops; 

 
public interface IShopsRepository extends MongoRepository<Shops, Long> {
	Shops findFirstByName(String name);
	Shops findFirstBy_id(ObjectId id);
	  /*@Query(value = "SELECT p FROM Post p WHERE p.id = ?1")
	    Post findOnePostById(Long id);*/
}
