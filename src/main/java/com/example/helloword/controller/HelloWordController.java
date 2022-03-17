package com.example.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2022-03-17  11:45
 */
@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public String hello(){
        return "helloWord";
    }
}
