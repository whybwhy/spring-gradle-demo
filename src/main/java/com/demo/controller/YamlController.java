package com.demo.controller;

import com.demo.config.MixedYamlConfig;
import com.demo.config.YamlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlController {
    @Autowired
    YamlConfig yamlConfig;
    @Autowired
    MixedYamlConfig mixedYamlConfig;

    @RequestMapping("/yml")
    public String modelA() {
        return yamlConfig.getServers().toString();
    }

    /**
     * java -jar -Dspring.profiles.active=local|live spring-gradle-demo-0.0.1-SNAPSHOT.war
     */
    @RequestMapping("/yml-multi-setting")
    public String modelB() {
        return mixedYamlConfig.getDatasourceName();
    }

}
