package com.example.order.maoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class mapcontroller {
    @GetMapping("/map")
    public String map(){
        return "123";
    }
}
