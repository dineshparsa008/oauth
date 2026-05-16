package com.demo.oauth.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactResource {


    @GetMapping("/contact")
    public String getContactDetails() {
        return "Here are the contact Details!";
    }
}
