package com.example.cms_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    // このメソッドをコピーして追加してください
    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

} 