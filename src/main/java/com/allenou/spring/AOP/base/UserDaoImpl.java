package com.allenou.spring.AOP.base;

public class UserDaoImpl implements  UserDao {
    @Override
    public void login() {
    }
    @Override
    public int add(int a, int b) {
        System.out.println("add 执行了");
        return a+b;
    }
    @Override
    public String update(String id) {
        System.out.println("update 执行了");
        return id;
    }
}
