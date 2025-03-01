package com.example.Springhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    @GetMapping("/hello/query")
    public String hello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}