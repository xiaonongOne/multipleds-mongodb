package com.example.multipledsmongodb.model.second;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName: SecondObj
 * @Author: xz
 * @CreateDate: 2019/3/16 10:31
 * @Version: 1.0
 */
@Document(collection = "second_obj")
public class SecondObj {
    @Id
    private String id;

    private String value;

    public SecondObj(String id, String value) {
        this.id = id;
        this.value = value;
    }

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
    @Override
    public String toString() {
        return "SecondObj{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
