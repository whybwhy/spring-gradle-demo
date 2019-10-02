package com.demo.controller;

import com.demo.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/domain")
    public SampleVO domain() {
        return new SampleVO("v1", "v2", "v3", "v4","v5");
    }
}
