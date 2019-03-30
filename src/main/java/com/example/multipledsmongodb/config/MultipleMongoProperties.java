package com.example.multipledsmongodb.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: MultipleMongoProperties
 * @Author: xz
 * @CreateDate: 2019/3/15 13:29
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

    private MongoProperties first = new MongoProperties();
    private MongoProperties second = new MongoProperties();

    public MongoProperties getFirst() {
        return first;
    }

    public void setFirst(MongoProperties first) {
        this.first = first;
    }

    public MongoProperties getSecond() {
        return second;
    }

    public void setSecond(MongoProperties second) {
        this.second = second;
    }
}
