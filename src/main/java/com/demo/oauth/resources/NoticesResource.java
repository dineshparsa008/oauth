package com.demo.oauth.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesResource {

    @GetMapping("/notices")
    public String getAccountLoanDetails() {
        return "These are the notices!";
    }

}
