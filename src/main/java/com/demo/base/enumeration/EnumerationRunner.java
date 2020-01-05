package com.demo.base.enumeration;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


public class EnumerationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long a = CalculatorType.CALC_A.calculate(100);
        long b = CalculatorType.CALC_B.calculate(100);
        long c = CalculatorType.CALC_C.calculate(100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
