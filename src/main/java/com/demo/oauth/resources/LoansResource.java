package com.demo.oauth.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansResource {


    @GetMapping("/loans")
    public String getAccountLoanDetails() {
        return "Here is Your Account Loan Details!";
    }
}
