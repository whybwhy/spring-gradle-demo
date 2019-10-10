package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YamlValueAnnotationRunner implements ApplicationRunner {

    @Autowired
    private YamlValueAnnotation yamlValueAnnotation;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(yamlValueAnnotation.getDatasourceName());
    }
}
