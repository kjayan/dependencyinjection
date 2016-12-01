package com.java.learn.di.noframework.services.client.impl;

import com.java.learn.di.noframework.services.message.MessageService;
import com.java.learn.di.noframework.exceptions.DIApplicationException;
import com.java.learn.di.noframework.exceptions.MessageServiceException;
import com.java.learn.di.noframework.services.client.Client;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyDIAppClientImpl implements Client{

    private MessageService messageService;

    public MyDIAppClientImpl(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipientAddress) throws DIApplicationException {
        try {
            this.messageService.sendMessage(message, recipientAddress);
        }catch(MessageServiceException e){
            throw new DIApplicationException(e);
        }
    }
}
