package com.freimanvs.spring.annotationsbased;

import com.freimanvs.spring.services.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myApplication")
@Scope("singleton")
public class MyApplication {

    //field-based dependency injection
    @Autowired
    @Qualifier("getMessageService")
    private MessageService service;

//	constructor-based dependency injection
//	@Autowired
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}

//    @Autowired
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean processMessage(String msg, String rec){
        //some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }
}
