package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo {
    @GetMapping
    String todo(){
        return "welcome";
    }
}
