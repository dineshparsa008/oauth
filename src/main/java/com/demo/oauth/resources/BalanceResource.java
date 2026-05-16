package com.demo.oauth.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceResource {

    @GetMapping("/balance")
    public String getAccountBalanceDetails() {

        return "Here is Your Account Balance Details!";
    }

}
