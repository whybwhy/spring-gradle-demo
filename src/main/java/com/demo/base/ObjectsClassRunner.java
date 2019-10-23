package com.demo.base;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleClassRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {


        AbstractObjects abstractObjects = new Objects();

        abstractObjects.abstractMethod();
        abstractObjects.publicMethod();
        abstractObjects.protectedMethod();

        System.out.println(abstractObjects instanceof AbstractObjects);
        System.out.println(abstractObjects instanceof Objects);
        System.out.println(abstractObjects.getClass());

        Objects objects = new Objects();
        objects.abstractMethod();
        objects.publicMethod();
        objects.protectedMethod();
        objects.extendedPublicMethod();

        System.out.println(objects instanceof AbstractObjects);
        System.out.println(objects instanceof Objects);
        System.out.println(objects.getClass());

    }
}
