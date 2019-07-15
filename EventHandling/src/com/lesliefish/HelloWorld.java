package com.lesliefish;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
