package com.vaibhav.oauth.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/user-details")
    public  String getUserDetails(Authentication authentication) {
        logger.info("Name : {}", authentication.getName());
        logger.info(authentication.getPrincipal().toString());

        return "Check Console";
    }
}
