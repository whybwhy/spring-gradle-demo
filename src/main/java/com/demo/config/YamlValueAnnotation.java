package com.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class YamlValueAnnotation {
    @Value("${sample.data.id}") private String id;
    @Value("${sample.data.age}") private String age;
    @Value("${spring.profiles}") private String profile;
    @Value("${spring.datasource.name}") private String datasourceName;
}
