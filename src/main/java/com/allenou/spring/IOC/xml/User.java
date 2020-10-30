package com.allenou.spring.IOC.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

    public  void add() {
        System.out.println("add....");
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/allenou/spring/IOC/xml/bean.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }
}
