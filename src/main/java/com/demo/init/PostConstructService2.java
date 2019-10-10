package com.demo.init;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class PostConstructService2 {

    @PostConstruct
    public void init2nd() {
        System.out.println("POSTCONSTRUCT-2");
    }

    @PostConstruct
    public void init1st() {
        System.out.println("POSTCONSTRUCT-1");
    }

}
