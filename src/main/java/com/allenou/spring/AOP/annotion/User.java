package com.allenou.spring.AOP.annotion;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
        System.out.println("add...");
    }
}
