package com.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PropertiesConfigrationRunner implements ApplicationRunner {

    @Autowired
    PropertiesConfigration properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(this.getClass().getName() + " " + properties.getId());
        System.out.println(this.getClass().getName() + " " + properties.getAge());
    }
}
