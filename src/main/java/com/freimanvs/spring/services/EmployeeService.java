package com.freimanvs.spring.services;

import com.freimanvs.spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service("employeeService")
@Qualifier("employeeService")
@Scope("singleton")
//@Scope("prototype")
//@Scope("request")
//@Scope("session ")
//@Scope("global-session ")
//@Scope(WebApplicationContext.SCOPE_REQUEST)
public class EmployeeService {

    @Autowired
    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee e){
        this.employee=e;
    }
}
