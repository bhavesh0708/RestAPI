package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _restController {

    @GetMapping("/")
    public String book(){

        return "Welcome to Rest Api page";
    }
}
