package com.demo.base.lambda.func;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
public class Student {

    private String name;
    private int userId;
    private String addr;

    public Student(String name, String addr, int userId) {
        this.name = name;
        this.userId = userId;
        this.addr = addr;
    }
}
