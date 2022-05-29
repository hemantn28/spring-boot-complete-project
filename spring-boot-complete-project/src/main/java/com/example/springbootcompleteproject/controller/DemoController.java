package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public void message(){
        System.out.println("Hello, welcome to spring boot..");
    }

    @RequestMapping("/message")
    public String hello(){
        return "This is my first spring boot app.";
    }

    @RequestMapping("/number")
    public int marks(){
        return 75;
    }
}
