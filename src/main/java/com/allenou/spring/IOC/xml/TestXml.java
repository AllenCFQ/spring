package com.allenou.spring.IOC.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    @Test
    public void testXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/allenou/spring/IOC/xml/bean.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }
}
