package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api")
public class demoController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Codespaces!";
    }

     @GetMapping("/helloWorld")
    public String sayHelloWorld() {
        return "Hello World!";
    }

     @GetMapping("/hi")
    public String sayHi() {
        return "Hi this is my first api";
    }

}
