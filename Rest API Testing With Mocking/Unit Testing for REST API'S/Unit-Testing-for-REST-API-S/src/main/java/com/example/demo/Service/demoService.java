package com.example.demo.Service;


import org.springframework.stereotype.Service;

@Service
public class demoService {

    public String welcome() {
        return "Welcome to REST API Controller";
    }
}
