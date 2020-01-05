package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {


    @Before("execution(* com.demo.*.*.*Aop(..))")
    public void onBeforeHandler(JoinPoint joinPoint) {
        System.out.println("BEFORE ======= ");
    }

    @After("execution(* com.demo.*.*.*Aop(..))")
    public void onAfterHandler(JoinPoint joinPoint) {
        System.out.println("AFTER ======= ");
    }

    @AfterReturning(value = "execution(* com.demo.*.*.*Aop(..))", returning = "obj")
    public void onAfterReturning(JoinPoint joinPoint, Object obj) {
        System.out.println("@AfterReturning : " + obj);
        System.out.println("=============== onAfterReturningHandler");
    }

    @Pointcut("execution(* com.demo.*.*.*Aop(..))")
    public void onPointcut(JoinPoint joinPoint) {
        System.out.println("=============== onPointcut");
    }

}
