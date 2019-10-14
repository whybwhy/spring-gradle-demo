package com.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class QualifierBeanRunner implements ApplicationRunner {

    @Autowired
    @Qualifier("qualifierBean0")
    private QualifierBeanAble bean0;

    @Autowired
    @Qualifier("qualifierBean1")
    private QualifierBeanAble bean1;

    @Autowired
    private ConfigurationAndBeanAndProperties ConfigurationAndBeanAndProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(bean0.getClass().getName());
        System.out.println(bean1.getClass().getName());
        System.out.println("==========");
        System.out.println(ConfigurationAndBeanAndProperties.getBean0());
        System.out.println(ConfigurationAndBeanAndProperties.getBean1());

        System.out.println(ConfigurationAndBeanAndProperties.getBean0().getId());
        System.out.println(ConfigurationAndBeanAndProperties.getBean1().getId());

        System.out.println(ConfigurationAndBeanAndProperties.getBean0());
        System.out.println(ConfigurationAndBeanAndProperties.getBean1());
    }
}
