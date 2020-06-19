package com.springbootconfig.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRoot {

    @Value("${app.message}")
    private String appMessage;
    
    @Value("${spring.application.name}")
    private String appName;

    @Value("${ENV_DB:NONE}")
    private String envDB;

    @GetMapping("/")
    public String rootMsg(){
        return appName + " app.message: " + appMessage;
    }

    @GetMapping("/env")
    public String envMsg(){
        return envDB;
    }
}