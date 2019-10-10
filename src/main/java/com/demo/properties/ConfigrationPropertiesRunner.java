package com.demo.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigrationPropertiesRunner implements ApplicationRunner {

    @Autowired
    ConfigrationProperties properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(this.getClass().getName() + " " + properties.getId());
        System.out.println(this.getClass().getName() + " " + properties.getAge());
    }
}
