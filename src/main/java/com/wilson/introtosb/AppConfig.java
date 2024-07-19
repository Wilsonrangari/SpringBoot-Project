package com.wilson.introtosb;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Apple getApple(){
        return new Apple();
    }
}
