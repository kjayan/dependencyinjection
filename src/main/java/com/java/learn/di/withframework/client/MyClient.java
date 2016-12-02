package com.java.learn.di.withframework.client;

import com.google.inject.Inject;
import com.java.learn.di.services.messages.MessageService;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MyClient {

    private MessageService messageService;

    /*@Inject
    public MyClient(MessageService messageService){
        this.messageService = messageService;
    }*/

    @Inject
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendMessage(String message,String recipientAddress){
        this.messageService.sendMessage(message,recipientAddress);
    }

}
