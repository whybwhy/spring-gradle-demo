package com.demo.base.defaultMethod;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DefaultMethodRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DefaultMethodTestable test = new DefaultMethodTest();
        test.defaultMethod();
        test.test();
    }
}
