package com.freimanvs.spring.services;

import com.freimanvs.spring.services.interfaces.MessageService;

public class EmailService implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email Sent to "+rec+ " with Message="+msg);
        return true;
    }
}