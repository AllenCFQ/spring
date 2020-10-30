package com.allenou.spring.AOP.annotion;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopAnnotion {

    @Test
    public void testAopAnnotion() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/allenou/spring/AOP/annotion/bean.xml");
        User user = (User) context.getBean("user",User.class);
        user.add();
    }
}
