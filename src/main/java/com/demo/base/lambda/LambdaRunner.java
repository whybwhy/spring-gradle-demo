package com.demo.base.lambda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class LambdaRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Testable test = (a, b) -> { return a + b; };
        test.plus(1, 3);
    }
}
