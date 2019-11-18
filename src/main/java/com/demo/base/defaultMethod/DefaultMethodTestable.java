package com.demo.base.defaultMethod;

import org.springframework.stereotype.Component;

public interface DefaultMethodTestable {

    default public void defaultMethod() {
        System.out.println("DEFAULT_METHOD");
    }

    void test();
}
