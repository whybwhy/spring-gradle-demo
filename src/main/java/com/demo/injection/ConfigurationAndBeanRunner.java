package com.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigurationAndBeanRunner implements ApplicationRunner {

    @Autowired
    ConfigurationAndBean bean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAndBean.class);
        List<String> beanList = context.getBean("getArrayList", List.class);
        beanList.add("a");
        beanList.add("b");
        beanList.add("c");
        System.out.println(bean);

        System.out.println(bean.getBean());
        System.out.println(bean.notBean());
    }
}
