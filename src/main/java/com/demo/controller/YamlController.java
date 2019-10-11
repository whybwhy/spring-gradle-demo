package com.demo.controller;

import com.demo.resources.YamlValueAnnotation;
import com.demo.resources.YamlConfigration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlController {
    @Autowired
    YamlConfigration yamlConfigration;
    @Autowired
    YamlValueAnnotation yamlValueAnnotation;

    @RequestMapping("/yml")
    public String modelA() {
        return yamlConfigration.getServers().toString();
    }

    /**
     * java -jar -Dspring.profiles.active=local|live spring-gradle-demo-0.0.1-SNAPSHOT.war
     */
    @RequestMapping("/yml-multi-setting")
    public String modelB() {
        return yamlValueAnnotation.getDatasourceName();
    }

}
