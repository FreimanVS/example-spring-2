package com.freimanvs.spring.listeners;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("myApplicationContextAware")
@Qualifier("myApplicationContextAware")
@Scope("singleton")
public class MyApplicationContextAware implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String applicationName = applicationContext.getApplicationName();
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        String displayName = applicationContext.getDisplayName();
        String id = applicationContext.getId();
        ApplicationContext parent = applicationContext.getParent();
        long startupDate = applicationContext.getStartupDate();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Environment environment = applicationContext.getEnvironment();

        System.out.println("applicationContext listener");
//        System.out.println("applicationName: " + applicationName);
//        System.out.println("displayName: " + displayName);
//        System.out.println("id: " + id);
//        System.out.println("parent: " + parent);
//        System.out.println("startupDate: " + startupDate);
//        System.out.println("beanDefinitionNames: " + Arrays.toString(beanDefinitionNames));
//        System.out.println("environment: " + environment);
    }
}
