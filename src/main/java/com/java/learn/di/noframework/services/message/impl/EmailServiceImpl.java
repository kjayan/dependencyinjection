package com.java.learn.di.noframework.services.message.impl;

import com.java.learn.di.noframework.exceptions.MessageServiceException;
import com.java.learn.di.noframework.services.message.MessageService;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class EmailServiceImpl implements MessageService {

    public void sendMessage(String message, String recipientAddress) throws MessageServiceException {
        System.out.println("Sending the email "+message+" to "+recipientAddress);

    }
}
