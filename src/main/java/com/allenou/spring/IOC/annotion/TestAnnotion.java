package com.allenou.spring.IOC.annotion;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotion {

    @Test
    public void testAnnotion() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService user = context.getBean("userService",UserService.class);
        user.add();
    }
}
