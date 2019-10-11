package com.demo;

import com.demo.injection.Bean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoWiredTests {

    // TODO FieldType
    //@Autowired
    //AutoWiredService service;

    // TODO Constructor
    private Bean service;
    @Autowired
    public AutoWiredTests(Bean service) {
        this.service = service;
    }


    @Test
    public void testA() {

        System.out.println(service.getStrValue());
    }

}
