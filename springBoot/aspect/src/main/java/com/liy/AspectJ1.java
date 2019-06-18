package com.liy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class AspectJ1 {

    @Pointcut("execution(* com.liy.*.*(..))")
    public void pcl(){
    }

    @Before(value = "pcl()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"   :start");
    }

    @After(value = "pcl()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"   :end");
    }
}
