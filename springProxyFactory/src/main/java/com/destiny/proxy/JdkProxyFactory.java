package com.destiny.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyFactory implements InvocationHandler {

    private  Object target;

    public  JdkProxyFactory(Object target){
        this.target =  target;
    }

    public  Object getProxyObject(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //添加功能
        System.out.println("添加日志功能");
        //执行原有方法
        return method.invoke(target, args);
    }

}

