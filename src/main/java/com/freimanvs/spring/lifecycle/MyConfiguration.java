package com.freimanvs.spring.lifecycle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value={"com.freimanvs.spring.lifecycle"})
@EnableAspectJAutoProxy/*(proxyTargetClass=true)*/
public class MyConfiguration {

    @Bean("method2")
    @Qualifier("method2")
    @Scope("singleton")
    public Method2 method2() {
        return new Method2();
    }
}
