package com.demo.base.interfac;

public interface DefaultMethodTestable {

    default public void defaultMethod() {
        System.out.println("DEFAULT_METHOD");
    }

    void test();
}
