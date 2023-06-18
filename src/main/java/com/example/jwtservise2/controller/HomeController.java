package com.example.jwtservise2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping()
    public String home(Principal principal){
        return "hello jwt, "+principal.getName();
    }
    @GetMapping("/main")
    public String home2(Principal principal){
        return "main jwt, "+principal.getName();
    }
}
