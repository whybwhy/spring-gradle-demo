package com.demo;

import com.demo.config.MixedYamlConfig;
import com.demo.config.YamlConfig;
import com.demo.controller.YamlController;
import lombok.Setter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
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
    YamlConfig yamlConfig;

    @Setter(onMethod_ = @Autowired)
    MixedYamlConfig mixedYamlConfig;

    @Autowired
    MockMvc mock;

    // TODO List 데이터 테스트
    @Test
    public void modelA() throws Exception {
        for (String env : yamlConfig.getServers()) {
            System.out.println(env);
        }

        MvcResult response = mock.perform(get("/yml")).andReturn();
        System.out.println(response.getResponse().getContentAsString());
    }

    // TODO Primitive 데이터 테스트
    // TODO 2 Depth 이상의 데이터 테스트
    @Test
    public void modelB() {
        System.out.println(mixedYamlConfig.getAge());
        System.out.println(mixedYamlConfig.getId());
    }

    // TODO 파일 분리 테스트 & Build 테스트
    @Test
    public void modelC() throws Exception {
        MvcResult response = mock.perform(get("/yml-multi-setting")).andReturn();
        System.out.println(response.getResponse().getContentAsString());
    }


    // TODO properties


    // TODO 이름 바꾸기
    // https://jekalmin.tistory.com/entry/Spring-Boot-yaml-%EC%84%A4%EC%A0%95%ED%8C%8C%EC%9D%BC-%EB%B6%88%EB%9F%AC%EC%98%A4%EA%B8%B0ConfigurationProperties

    // TODO NEXT https://www.donnert.net/81
    // TODO 정리 할 것
    //  https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/reference/html/configuration-metadata.html#configuration-metadata-annotation-processor

    // https://jeong-pro.tistory.com/159
    // https://effectivesquid.tistory.com/m/36
}
