package com.robinchien;

import org.springframework.web.bind.annotation.GetMapping;

public class GithubCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to java!";
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}