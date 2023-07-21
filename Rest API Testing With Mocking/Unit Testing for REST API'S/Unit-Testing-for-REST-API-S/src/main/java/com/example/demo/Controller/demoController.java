package com.example.demo.Controller;


import com.example.demo.Service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @Autowired
    private demoService service;


    @GetMapping(value = "/welcome")
    public String welcome() {
        return service.welcome();
    }
}
