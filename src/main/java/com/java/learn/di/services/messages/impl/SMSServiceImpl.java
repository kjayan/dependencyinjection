package com.java.learn.di.services.messages.impl;

import com.google.inject.Singleton;
import com.java.learn.di.services.messages.MessageService;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
@Singleton
public class SMSServiceImpl implements MessageService {
    public void sendMessage(String message, String recipientAddress){
        System.out.println("Sending the SMS "+message+" to "+recipientAddress);

    }
}
