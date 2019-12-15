package com.freimanvs.spring.xmlbased;

import com.freimanvs.spring.services.interfaces.MessageService;

public class MyXMLApplication {

    private MessageService service;

    //constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}

    //setter-based dependency injection
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean processMessage(String msg, String rec) {
        // some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }
}
