package com.example.fivepoints.Ressource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class Home {

    @GetMapping
    public String home(){
        return "Application is work !!! "+new Date();
    }
}
