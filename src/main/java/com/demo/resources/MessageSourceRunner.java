package com.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("message.language", new String[]{"안녕하세요"}, Locale.KOREA ));
        System.out.println(messageSource.getMessage("message.language2", new String[]{"안녕하세요"}, "Not Found", Locale.KOREA ));
        System.out.println(messageSource.getMessage("message.language", new String[]{"hi"}, Locale.ENGLISH));

    }
}
