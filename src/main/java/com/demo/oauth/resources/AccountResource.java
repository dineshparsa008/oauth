package com.demo.oauth.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResource {


    @GetMapping("/account")
    public String getAccountDetails() {

        return "Here is Your Account Details!";
    }

}
