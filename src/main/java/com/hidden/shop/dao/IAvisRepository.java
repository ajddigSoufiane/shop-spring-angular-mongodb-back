package com.hidden.shop.dao;
 

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hidden.shop.entity.Avis; 

public interface IAvisRepository extends MongoRepository<Avis, ObjectId> {

}
