package com.donghwan.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConotroller {

    @RequestMapping("")
    public String hello() throws Exception {
        return "Hello !!";
    }
}
