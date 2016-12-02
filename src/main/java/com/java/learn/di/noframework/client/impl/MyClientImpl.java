package com.java.learn.di.noframework.client.impl;

import com.java.learn.di.services.messages.MessageService;
import com.java.learn.di.noframework.client.MyClient;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyClientImpl implements MyClient {

    private final MessageService messageService;

    public MyClientImpl(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipientAddress){
        this.messageService.sendMessage(message, recipientAddress);
    }
}
