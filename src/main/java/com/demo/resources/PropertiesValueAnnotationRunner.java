package com.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PropertiesValueAnnotationRunner implements ApplicationRunner {
    @Autowired
    PropertiesValueAnnotation properties;

    //@Setter(onMethod_ = @Autowired)
    //BaseProperties properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(properties.getAge());
        System.out.println(properties.getId());
    }
}
