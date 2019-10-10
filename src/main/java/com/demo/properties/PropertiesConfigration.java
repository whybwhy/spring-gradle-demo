package com.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Setter 반드시 구현이 필요하다.
 */
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "sample.data")
public class PropertiesConfigration {
    private String id;
    private int age;
}
