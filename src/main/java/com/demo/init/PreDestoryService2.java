package com.demo.init;

import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

@Component
public class PreDestoryService2 {

    @PreDestroy
    public void destory4th() {
        System.out.println("DESTORY-4");
    }

    @PreDestroy
    public void destory3rd() {
        System.out.println("DESTORY-3");
    }
}
