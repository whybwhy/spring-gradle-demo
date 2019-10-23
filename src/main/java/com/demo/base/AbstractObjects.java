package com.demo.base;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractObjects {

    // 반드시 override 되어야 하는 메소드
    abstract public void abstractMethod();

    // protected는 반드시 override 할 필요가 없는 메소드
    // abstract는 반드시 override 되어야 하는 메소드
    // 조합의 의미가 없다.
    @Deprecated abstract protected void abstractProtectedMethod();

    private void privateMethod() {

    }
    public void publicMethod(){

    }

    protected void protectedMethod() {

    }
}
