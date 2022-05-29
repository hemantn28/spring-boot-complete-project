package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/msg/{name}")
    public String hello(@PathVariable String name){
        return "Welcome to Path variable "+name;
    }
}
