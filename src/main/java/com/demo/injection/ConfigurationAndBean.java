package com.demo.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationAndBean {

    @Bean(name="getArrayList")
    public List<String> array() {
        return new ArrayList<String>();
    }

    @Bean
    public String getBean() {
        return this.toString();
    }

    public String notBean() {
        return null;
    }
}
