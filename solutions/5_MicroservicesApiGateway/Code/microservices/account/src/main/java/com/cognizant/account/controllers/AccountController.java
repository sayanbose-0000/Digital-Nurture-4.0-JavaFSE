package com.cognizant.account.controllers;

import com.cognizant.account.models.AccountModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public AccountModel getAccountDetails(@PathVariable String number) {
        return new AccountModel(number, "Savings", 17789);
    }
}
