package com.demo.base;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MovableRunner implements ApplicationRunner {

    public void run(ApplicationArguments args) throws Exception {
        Movable bus = new Airplain();

        System.out.println(bus instanceof Movable);
        System.out.println(bus instanceof Airplain);
        System.out.println(bus.getClass());
    }
}
