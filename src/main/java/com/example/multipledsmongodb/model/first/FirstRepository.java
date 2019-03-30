package com.example.multipledsmongodb.model.first;

import com.example.multipledsmongodb.model.first.FirstObj;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FirstRepository extends MongoRepository<FirstObj, String> {

}
