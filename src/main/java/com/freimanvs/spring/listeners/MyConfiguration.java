package com.freimanvs.spring.listeners;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value={"com.freimanvs.spring.listeners"})
@EnableAspectJAutoProxy/*(proxyTargetClass=true)*/
public class MyConfiguration {

}
