package com.demo.controller;

import com.demo.domain.SampleVO;
import com.demo.injection.Bean;
import org.springframework.beans.factory.annotation.Autowired;
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


    // TODO FieldType
    //@Autowired
    //AutoWiredService service;

    // TODO Constructor
    /*private AutoWiredService service;
    @Autowired
    public SampleController(AutoWiredService service) {
        this.service = service;
    }*/

    // TODO Method
    /*private AutoWiredService service;
    @Autowired
    public void initService(AutoWiredService service) {
        this.service = service;
    }*/

    private Bean service;
    public void initService(@Autowired Bean service) {
        this.service = service;
    }

    @GetMapping("/auto")
    public String auto() {

        initService(service);

        service.setStrValue("success");
        return service.getStrValue();
    }

}
