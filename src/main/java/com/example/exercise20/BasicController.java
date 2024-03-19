package com.example.exercise20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Autowired
    private Environment environment;
    @Value("${property.authCode}")
    String authCode;
    @Value("${property.devName}")
    String devName;
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome " + devName + " " + authCode;
    }
}
