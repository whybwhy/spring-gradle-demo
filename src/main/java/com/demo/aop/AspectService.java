package com.demo.aop;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class AspectService {
    public void methodAop() {
        System.out.println("MethodAOP");
    }
}