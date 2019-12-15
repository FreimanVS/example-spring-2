package com.freimanvs.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAnnotationAspect {

    @Before("@annotation(com.freimanvs.spring.annotations.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice!!");
    }
}
