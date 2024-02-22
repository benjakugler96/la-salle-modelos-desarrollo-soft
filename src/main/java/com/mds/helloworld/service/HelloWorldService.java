package com.mds.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getHelloWorld(String id) {
        // Simulate that from here we would read from database, do calculations
        // and return something.
        return "Hello World: " + id;
    }
}

