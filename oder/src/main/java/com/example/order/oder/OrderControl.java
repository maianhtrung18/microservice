package com.example.order.oder;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControl {
    @GetMapping("/order")
    public ResponseEntity<?> order(){
        ResponseData responseData = new ResponseData();
        responseData.setData("1234567");
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
