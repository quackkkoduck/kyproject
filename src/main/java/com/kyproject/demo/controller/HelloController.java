package com.kyproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController
@Controller
public class HelloController {
    
    @Autowired

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
