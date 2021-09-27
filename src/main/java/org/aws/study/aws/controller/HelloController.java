package org.aws.study.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello, time: " + LocalDateTime.now();
    }

}
