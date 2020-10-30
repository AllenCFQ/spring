package com.allenou.spring.AOP.annotion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value="execution(* com.allenou.spring.AOP.annotion.User.add(..))")
    public void pointdemeo(){

    }
    @Before(value="pointdemeo()")
    public void before() {
        System.out.println("before...");
    }

    @After(value="execution(* com.allenou.spring.AOP.annotion.User.add(..))")
    public void after() {
        System.out.println("after...");
    }

    @AfterThrowing(value="execution(* com.allenou.spring.AOP.annotion.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @AfterReturning(value="execution(* com.allenou.spring.AOP.annotion.User.add(..))")
    public void afterReturning() {
        System.out.println("AfterReturning...");
    }

    @Around(value="execution(* com.allenou.spring.AOP.annotion.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before...");
        point.proceed();
        System.out.println("around after...");
    }
}
