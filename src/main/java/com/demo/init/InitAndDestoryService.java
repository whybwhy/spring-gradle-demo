package com.demo.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitAndDestoryService implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("InitAndDestoryService-Destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitAndDestoryService-Init");
    }
}
