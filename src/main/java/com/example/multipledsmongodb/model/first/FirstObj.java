package com.example.multipledsmongodb.model.first;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName: FirstObj
 * @Author: xz
 * @CreateDate: 2019/3/16 10:27
 * @Version: 1.0
 */
@Document(collection = "first_obj")
public class FirstObj {
    @Id
    private String id;

    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FirstObj(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "FirstObj{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
