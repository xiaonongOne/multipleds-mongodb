package com.example.multipledsmongodb;

import com.example.multipledsmongodb.config.MultipleMongoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MultipleMongoProperties.class)
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class MultipledsMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipledsMongodbApplication.class, args);
    }

}
