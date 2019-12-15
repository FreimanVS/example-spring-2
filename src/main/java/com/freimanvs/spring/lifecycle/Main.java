package com.freimanvs.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {
//            MyApplication app = context.getBean("myApplication", MyApplication.class);
//            app.processMessage("Hi Pankaj", "pankaj@abc.com");
//
//            MessageService getMessageService = context.getBean("getMessageService", MessageService.class);
//            System.out.println(getMessageService);

//            Employee employee = context.getBean("employee", Employee.class);
//            Employee employee2 = context.getBean("employee", Employee.class);
//            System.out.println(employee);
//            System.out.println(employee2);
//            employee.setName("someName");
//            String name =employee.getName();
//            employee.throwException();

//            Method1 method1 = context.getBean("method1", Method1.class);
//            Method2 method2 = context.getBean("method2", Method2.class);
//            System.out.println(method1);
//            System.out.println(method2);
        }
    }

}
