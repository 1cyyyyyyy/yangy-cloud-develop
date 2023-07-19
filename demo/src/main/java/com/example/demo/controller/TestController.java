package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yangy
 * @Date 2023/7/17 14:49
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
