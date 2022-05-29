package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String addition(){
        int a=6;
        int b=3;
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/subtract")
    public String subtraction(){
        int a=45;
        int b=12;
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/multiplication")
    public String multiply(){
        int a=2;
        int b=4;
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=25;
        int b=5;
        return "division is "+(a/b);
    }
}
