package com.example.Springhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPath {
    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }
}
