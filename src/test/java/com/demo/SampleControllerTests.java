package com.demo;

import com.demo.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
//@SpringBootTest
public class SampleControllerTests {
    @Autowired
    MockMvc mock;

    @Test
    public void testIndex() throws Exception {
        MvcResult result = mock.perform(get("/index")).andExpect(content().string("index")).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }


}
