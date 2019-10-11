package com.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ValueBeanRunner implements ApplicationRunner {

    @Autowired
    private ValueBean vo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(vo.getStringValue());
        System.out.println(vo.getIntValue());
    }
}
