package com.freimanvs.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("method1")
@Qualifier("method1")
@Scope("singleton")
public class Method1 implements InitializingBean, DisposableBean {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("no static block");
    }

    public Method1() {
        System.out.println("no args constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("before destroying");
    }
}
