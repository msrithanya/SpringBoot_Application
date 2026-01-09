package com.example.first;

import org.springframework.stereotype.Component;

@Component
public class Message {
    public String message(){
        return "Email Message send";
    }
}
