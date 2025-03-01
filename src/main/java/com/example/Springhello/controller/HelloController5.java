package com.example.Springhello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController5 {
    @PutMapping("/hello/put/{firstName}")
    public String putHello(
            @PathVariable String firstName,
            @RequestParam String lastName
    ){
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
