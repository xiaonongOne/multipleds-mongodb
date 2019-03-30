package com.example.multipledsmongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @ClassName: FirstMongoConfig
 * @Author: xz
 * @CreateDate: 2019/3/15 13:31
 * @Version: 1.0
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.example.multipledsmongodb.model.first",
        mongoTemplateRef = FirstMongoConfig.MONGO_TEMPLATE)
public class FirstMongoConfig {
    protected static final String MONGO_TEMPLATE = "firstMongoTemplate";
}
