package com.demo.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class OauthApplication {

	public static void main(String[] args) {

        SpringApplication.run(OauthApplication.class, args);
	}

}
