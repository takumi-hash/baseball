package com.example.baseball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 1
public class HelloWorld {
    @GetMapping("/") // 2
    public String hello() {
        return "hello"; // 3
    }
}
