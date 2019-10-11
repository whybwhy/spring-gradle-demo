package com.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class QualifierBeanRunner implements ApplicationRunner {

    @Autowired
    @Qualifier("qualifierBean0")
    private QualifierBeanAble bean0;

    @Autowired
    @Qualifier("qualifierBean1")
    private QualifierBeanAble bean1;

    /*private QualifierBean bean3;
    private QualifierBean bean4;

    public QualifierBean getBeanFactory(@Value("str1") String str0, @Value("str1") String str1) {
        return bean3;
    }

    public QualifierBean getBeanFactory(@Value("str1") String str0, @Value("str1") String str1) {
        return bean4;
    }*/


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(bean0.getClass().getName());
        System.out.println(bean1.getClass().getName());

    }
}
