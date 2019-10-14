package com.demo.injection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationAndBeanAndProperties {

    @Bean
    @Scope("prototype")
    @ConfigurationProperties(prefix="sample.properties0")
    public QualifierBean getBean0() {
        return new QualifierBean();
    }

    @Bean
    @Scope("prototype")
    @ConfigurationProperties(prefix="sample.properties1")
    public QualifierBean getBean1() {
        return new QualifierBean();
    }

}
