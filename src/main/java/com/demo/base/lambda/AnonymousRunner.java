package com.demo.base.lambda;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AnonymousRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Testable test = new Testable() {
            @Override
            public int plus(int a, int b) {
                return (a * 2) + b;
            }
        };

        System.out.println(test.plus(1, 2));
    }
}
