package com.freimanvs.spring.services;

import com.freimanvs.spring.services.interfaces.MessageService;

public class TwitterService implements MessageService {

    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
    }

}
