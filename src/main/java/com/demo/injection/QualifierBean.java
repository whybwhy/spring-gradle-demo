package com.demo.injection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class QualifierBean implements QualifierBeanAble {
    private String id;
    private int age;
}
