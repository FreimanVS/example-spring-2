package com.freimanvs.spring.todelete;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    public ReentrantLock reentrantLock = new ReentrantLock(false);

    @Around("execution(public void com.freimanvs.spring.todelete.Todelete.method())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoking method");
        Object value = null;
        try {
            reentrantLock.lock();
            TimeUnit.SECONDS.sleep(2);
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
        System.out.println("After invokingmethod");
        return value;
    }
}
