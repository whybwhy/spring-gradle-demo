package com.demo.base;

import org.springframework.stereotype.Component;

@Component
public class Objects extends AbstractObjects {

    @Override
    public void abstractMethod() {

    }

    @Override
    @Deprecated
    protected void abstractProtectedMethod() {

    }

    public void extendedPublicMethod() {

    }

    // Objects를 상속할 필요가 없다면 protected를 사용할 필요는 없다.
    @Deprecated protected void abstractSampleMethod6() {
        System.out.println("abstractSampleMethod2");
    }
}
