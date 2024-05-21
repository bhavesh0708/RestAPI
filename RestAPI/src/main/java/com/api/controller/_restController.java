package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _restController {

    @GetMapping("/")
    public ResponseEntity<?> book(){

        return ResponseEntity.status(HttpStatus.OK).body("Rest API Access Granted , Welcome");
    }
}
