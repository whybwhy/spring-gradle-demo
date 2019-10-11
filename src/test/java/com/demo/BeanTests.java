package com.demo;

import com.demo.injection.ConfigurationAndBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTests {

    @Autowired
    ConfigurationAndBean bean;

    @Test
    public void beanTestA() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAndBean.class);
        List<String> bean = context.getBean("getArrayList", List.class);
        bean.add("a");
        bean.add("b");
        bean.add("c");
        System.out.println(bean);
    }

    @Test
    public void beanTestB() {
        System.out.println(bean.getBean());
        System.out.println(bean.notBean());

    }
}
