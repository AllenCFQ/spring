package com.allenou.spring.IOC.annotion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类，替代配置文件
@ComponentScan(basePackages = {"com.allenou.spring.IOC"})
public class SpringConfig {

}
