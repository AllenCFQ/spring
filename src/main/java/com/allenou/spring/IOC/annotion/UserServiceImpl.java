package com.allenou.spring.IOC.annotion;

import org.springframework.stereotype.Component;

@Component(value="userService")
public class UserServiceImpl  implements  UserService {
    @Override
    public void add() {
        System.out.println("add...");
    }
}
