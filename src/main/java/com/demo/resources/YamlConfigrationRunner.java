package com.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YamlConfigrationRunner implements ApplicationRunner {

    @Autowired
    private YamlConfigration yamlConfigration;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        yamlConfigration.getServers().stream().forEach(server -> System.out.println(server));
    }
}
