package com.example.multipledsmongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @ClassName: SencondMongoConfig
 * @Author: xz
 * @CreateDate: 2019/3/16 11:03
 * @Version: 1.0
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.example.multipledsmongodb.model.second",
        mongoTemplateRef = SencondMongoConfig.MONGO_TEMPLATE)
public class SencondMongoConfig {
    protected static final String MONGO_TEMPLATE = "sencondMongoTemplate";
}
