package com.example.SpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebAppApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Matt!") String name) {
        return String.format("Hello %s!", name);
    }


}
