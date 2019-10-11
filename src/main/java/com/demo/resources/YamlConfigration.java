package com.demo.resources;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "env")
@Getter
@Setter
public class YamlConfigration {
    private List<String> servers;
}
