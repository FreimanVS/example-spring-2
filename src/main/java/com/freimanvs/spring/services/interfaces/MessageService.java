package com.freimanvs.spring.services.interfaces;

public abstract interface MessageService {
    public abstract boolean sendMessage(String msg, String rec);
}