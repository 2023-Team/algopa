package com.example.algopa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AlgopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgopaApplication.class, args);
    }

    // page move
    @GetMapping("/my_study")
    public String myPage() {
        return "my_study"; // 이동할 HTML 뷰 이름
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // 이동할 HTML 뷰 이름
    }

}
