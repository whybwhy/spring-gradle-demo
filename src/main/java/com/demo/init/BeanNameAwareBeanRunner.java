package com.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BeanNameAwareBeanRunner implements ApplicationRunner {

    @Autowired
    private BeanNameAwareBean bean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bean.call();
    }
}
