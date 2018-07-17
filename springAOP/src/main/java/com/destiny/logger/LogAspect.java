package com.destiny.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 作用是把当前类标识为一个切面供容器读取
@Aspect
// 把普通pojo实例化到spring容器中
@Component
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    // 标识一个前置增强方法，相当于BeforeAdvice的功能
    @Before("execution(* com.destiny.service..*.*(..))")
    public void log(){
        logger.info("before method log done");
    }

    // final增强，不管是抛出异常或者正常退出都会执行
    // 可以通过JoinPoint取到aop的类名，方法参数，方法签名
    @After("execution(* com.destiny.service..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        logger.info("after method log done "
                +joinPoint.getTarget().getClass()
                +",args="
                + Arrays.asList(joinPoint.getArgs())
                +",method="
                +joinPoint.getSignature());
    }

}

