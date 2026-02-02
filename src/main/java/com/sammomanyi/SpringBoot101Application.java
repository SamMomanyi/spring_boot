package com.sammomanyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot101Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot101Application.class, args);
    }

    @GetMapping
    public String hellowWorld(){
        return "Hello WOrld Spring Boot";
    }
}
