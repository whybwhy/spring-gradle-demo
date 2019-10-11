package com.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanAutowiredRunner implements ApplicationRunner {

    // TODO FieldType
    //@Autowired
    //private AutoWiredVO autowired;

    // TODO Constructor
    /*private AutoWiredVO autowired;
    @Autowired
    public AutoWiredVORunner(AutoWiredVO autowired) {
        this.autowired = autowired;
    }*/

    // TODO Setter + Lombok
    /*@Setter(onMethod_ = @Autowired)
    private AutoWiredVO service;*/

    // TODO Method
    private Bean autowired;
    @Autowired
    public void initMethod(Bean autowired) {
        this.autowired = autowired;
    }

    // TODO List or Array
    @Autowired
    private List<BeanAble> beanList;

    // TODO Map
    @Autowired
    private Map<String, BeanAble> beanMap;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        autowired.setStrValue("String");
        System.out.println(autowired.getStrValue());

        // List or Array --> ArrayList
        beanList.stream().forEach(System.out::println);
        System.out.println(beanList.getClass());

        // Map --> LinkedHashMap
        for ( String key : beanMap.keySet()) {
            System.out.println(key);
        }
        System.out.println(beanMap.get("bean0").getClass());
        System.out.println(beanMap.getClass());

        //https://araikuma.tistory.com/53
    }
}
