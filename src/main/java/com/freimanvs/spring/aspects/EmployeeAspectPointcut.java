package com.freimanvs.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}

    //Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(com.freimanvs.spring.services.*)")
    public void allMethodsPointcut(){}

    @Before("getNamePointcut()")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice(){
        System.out.println("Before executing service method");
    }

}
