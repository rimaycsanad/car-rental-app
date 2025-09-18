package com.rimaycsanad.carrental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @GetMapping("/cars")
    public String getCars() {
        return "[]"; // Placeholder for car list
    }
}