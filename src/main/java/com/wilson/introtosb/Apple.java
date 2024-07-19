package com.wilson.introtosb;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    public void eatApple(){
        System.out.println("I am eating an apple");
    }

//    Apple(){
//        System.out.println("I am an apple");
//    }
//    @PostConstruct
//    public void getAppleMsg(){
//        System.out.println("I am post construct");
//    }

//    @PreDestroy
//    public void destroyMethod(){
//        System.out.println("I am being destroyed onces bean gets destroyed ");
//    }
}
