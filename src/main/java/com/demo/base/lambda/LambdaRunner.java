package com.demo.base.lambda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LambdaRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Testable test = (a, b) -> { return a + b; };
        System.out.println(test.plus(1, 3));
    }
}
