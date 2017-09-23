package com.pacroy.helloworld.com.pacroy.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pacroy on 7/15/17.
 */
@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Hello world from Spring Boot";
    }
}
