package com.mds.helloworld.controller;

import com.mds.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/hello-world")
    public String get() {
        return "Hello World";
    }

    @GetMapping("/hello-world/{id}")
    public String get(@PathVariable String id) {
        return helloWorldService.getHelloWorld(id);
    }
}
