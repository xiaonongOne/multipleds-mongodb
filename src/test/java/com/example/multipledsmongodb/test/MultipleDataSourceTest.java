package com.example.multipledsmongodb.test;

import com.example.multipledsmongodb.model.first.FirstObj;
import com.example.multipledsmongodb.model.first.FirstRepository;
import com.example.multipledsmongodb.model.second.SecondObj;
import com.example.multipledsmongodb.model.second.SecondRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName: MultipleDataSourceTest
 * @Author: xz
 * @CreateDate: 2019/3/16 10:35
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipleDataSourceTest {
    @Autowired
    private FirstRepository firstRepository;
    @Autowired
    private SecondRepository secondRepository;

    @Test
    public void save() {
        this.firstRepository
                .save(new FirstObj(null, "第一个库的对象3"));

        this.secondRepository
                .save(new SecondObj(null, "第二个库的对象3"));

        List<FirstObj> primaries = this.firstRepository.findAll();
        for (FirstObj primary : primaries) {
            System.out.println(primary.toString());
        }

        List<SecondObj> secondaries = this.secondRepository.findAll();

        for (SecondObj secondary : secondaries) {
            System.out.println(secondary.toString());
        }
    }
}
