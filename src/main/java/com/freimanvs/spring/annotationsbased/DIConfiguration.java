package com.freimanvs.spring.annotationsbased;

import com.freimanvs.spring.aspects.EmployeeAspectPointcut;
import com.freimanvs.spring.model.Employee;
import com.freimanvs.spring.services.EmailService;
import com.freimanvs.spring.services.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value={"com.freimanvs.spring"})
@EnableAspectJAutoProxy/*(proxyTargetClass=true)*/
public class DIConfiguration {
    @Bean("getMessageService")
    @Scope("singleton")
    @Qualifier("getMessageService")
    public MessageService getMessageService() {
        return new EmailService();
    }

    @Bean("employee")
    //@Scope("prototype")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Employee getEmployee() {
        Employee e = new Employee();
        e.setName("Dummy Name");
        return e;
    }

    @Bean("employeeAspectPointcut")
    @Scope("singleton")
    public EmployeeAspectPointcut employeeAspectPointcut() {
        return new EmployeeAspectPointcut();
    }

//    @Bean("myApplication")
//    public MyApplication myApplication(MessageService getMessageService) {
//        MyApplication myApplication = new MyApplication();
//        myApplication.setService(getMessageService);
//        return myApplication;
//    }
}
