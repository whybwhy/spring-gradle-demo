package com.demo.init;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * @PostConstruct 는 여러 곳에 선언될 수 있으나
 * @Order 는 Type, Method 적용되지 않는다
 * 한 구간에서 관리하는 방법과 각각 초기화가 필요한 구간이 있고 장단점이 있다.
 */
@Component
public class PostConstructService1{

    @PostConstruct
    public void init3nd() {
        System.out.println("POSTCONSTRUCT-3");
    }

    @PostConstruct
    public void init4st() {
        System.out.println("POSTCONSTRUCT-4");
    }

}
