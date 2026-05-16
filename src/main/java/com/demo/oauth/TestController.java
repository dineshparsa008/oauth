package com.demo.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/message")
    public String getMessage() {

        return "First Spring boot controller with security";
    }

    ;
}
