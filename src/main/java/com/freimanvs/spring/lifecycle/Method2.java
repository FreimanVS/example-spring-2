package com.freimanvs.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Method2 {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("no static block");
    }

    public Method2() {
        System.out.println("no args constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
