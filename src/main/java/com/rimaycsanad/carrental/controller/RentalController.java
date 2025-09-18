package com.rimaycsanad.carrental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalController {
    @GetMapping("/rentals")
    public String getRentals() {
        return "[]"; // Placeholder for rental list
    }
}