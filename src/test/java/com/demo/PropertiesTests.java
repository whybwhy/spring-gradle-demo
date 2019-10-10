package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"sample.data.id=whybwhy","sample.data.age=39"})
public class PropertiesTests {
    @Autowired
    Environment env;

    @Test
    public void testModelA() {
        System.out.println(env.getProperty("sample.data.id"));
        System.out.println(env.getProperty("sample.data.age"));
    }
}
