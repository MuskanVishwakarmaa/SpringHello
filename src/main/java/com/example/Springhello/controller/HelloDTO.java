package com.example.Springhello.controller;

import com.example.Springhello.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDTO {
    @PostMapping("/hello/post")
    public String hello(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
