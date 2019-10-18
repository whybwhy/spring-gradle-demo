package com.demo.init;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanNameAwareBean implements BeanNameAware {

    private String beanName;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct Class : " + beanName);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy Class : " + beanName);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SetBeanName Class : " + name);
        this.beanName = name;
    }

    public void call() {
        System.out.println("Executing Class : " + beanName);
    }
}
