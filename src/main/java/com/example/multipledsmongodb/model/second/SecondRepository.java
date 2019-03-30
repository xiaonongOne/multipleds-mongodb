package com.example.multipledsmongodb.model.second;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName: SecondRepository
 * @Author: xz
 * @CreateDate: 2019/3/16 10:32
 * @Version: 1.0
 */
public interface SecondRepository extends MongoRepository<SecondObj, String> {

}
