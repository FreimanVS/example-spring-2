package com.freimanvs.spring.annotationsbased;

import com.freimanvs.spring.model.Employee;
import com.freimanvs.spring.services.EmployeeService;
import com.freimanvs.spring.services.interfaces.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class)) {
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

//            EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
//            System.out.println(employeeService.getEmployee().getName());
        }
    }

}