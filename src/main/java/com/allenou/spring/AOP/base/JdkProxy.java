package com.allenou.spring.AOP.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 使用JDK动态代理代码
 * oyp
 */
public class JdkProxy {
    public static void main(String[] args) {
        /**
         * 1.创建接口实现类代理对象
         */
        Class[] interfaces = {UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao dao  = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(),interfaces, new UserDaoProxy(userDao));
        dao.add(1,2);
        dao.update("test");
    }
}

// 创建代理对象代码

class UserDaoProxy implements  InvocationHandler {
    // 1 把创建的是谁的对象，把谁传递过来
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }
    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行..."+method.getName()+";传递的参数："+ Arrays.toString(args));
        Object res = method.invoke(obj,args);
        System.out.println("方法之后执行..."+res);
        return res;
    }
}
