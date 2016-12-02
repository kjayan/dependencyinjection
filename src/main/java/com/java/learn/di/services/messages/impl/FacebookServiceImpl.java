package com.java.learn.di.services.messages.impl;

import com.java.learn.di.services.messages.MessageService;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class FacebookServiceImpl implements MessageService {

    public void sendMessage(String message, String recipientAddress){
        System.out.println("Message sent to Facebook user "+recipientAddress+" with message="+message);
    }
}
