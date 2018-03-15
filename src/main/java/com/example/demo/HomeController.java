package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
