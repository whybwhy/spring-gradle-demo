package com.demo;

import com.demo.resources.YamlValueAnnotation;
import com.demo.resources.YamlConfigration;
import lombok.Setter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
//@SpringBootTest(properties = {"classpath:application.yml"} )
//@WebMvcTest(controllers = {YamlController.class}, properties = {"classpath:application.yml"})
//@WebMvcTest(controllers = {YamlController.class})
@SpringBootTest
@TestPropertySource("classpath:application.yml")
@ActiveProfiles("live")
@AutoConfigureMockMvc
public class YamlTests {

    @Setter(onMethod_ = @Autowired)
    YamlConfigration yamlConfigration;

    @Setter(onMethod_ = @Autowired)
    YamlValueAnnotation yamlValueAnnotation;

    @Autowired
    MockMvc mock;

    // TODO List 데이터 테스트
    @Test
    public void modelA() throws Exception {
        for (String env : yamlConfigration.getServers()) {
            System.out.println(env);
        }

        MvcResult response = mock.perform(get("/yml")).andReturn();
        System.out.println(response.getResponse().getContentAsString());
    }

    // TODO Primitive 데이터 테스트
    // TODO 2 Depth 이상의 데이터 테스트
    @Test
    public void modelB() {
        System.out.println(yamlValueAnnotation.getAge());
        System.out.println(yamlValueAnnotation.getId());
    }

    // TODO 파일 분리 테스트 & Build 테스트
    @Test
    public void modelC() throws Exception {
        MvcResult response = mock.perform(get("/yml-multi-setting")).andReturn();
        System.out.println(response.getResponse().getContentAsString());
    }
}
