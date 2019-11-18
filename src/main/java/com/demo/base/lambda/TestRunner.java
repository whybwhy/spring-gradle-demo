package com.demo.base.lambda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
class TestImpl implements Testable {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }
}

@Component
public class TestRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Testable test = new TestImpl();
        System.out.println(test.plus(1, 2));
    }
}
