package com.example.order.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class login {

    @GetMapping("/users")
    public ResponseEntity<?> login(){

        return new ResponseEntity<>("1234", HttpStatus.OK);
    }
}
