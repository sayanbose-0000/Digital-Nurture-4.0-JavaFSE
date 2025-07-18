package com.cognizant.loan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.models.LoanModel;


@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public LoanModel getLoanDetails(@PathVariable String number) {
        return new LoanModel(number, "car", 400000, 3258, 18);
    }
}