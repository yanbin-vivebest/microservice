package com.consumer.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/user")
public class MyUserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("")
    public Object getUserList(){
        Object res = restTemplate.getForObject("http://producer/v1/user",Object.class);
        System.out.println("1111");
        return res;
    }
}
