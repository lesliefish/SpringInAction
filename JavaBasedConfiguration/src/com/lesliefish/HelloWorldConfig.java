package com.lesliefish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
