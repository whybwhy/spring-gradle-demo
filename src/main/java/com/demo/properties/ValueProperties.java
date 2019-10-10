package com.demo.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ValueProperties {
    @Value("${sample.data.id}")
    private String id;
    @Value("${sample.data.age}")
    private String age;
}
