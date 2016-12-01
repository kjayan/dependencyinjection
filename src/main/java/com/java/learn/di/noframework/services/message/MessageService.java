package com.java.learn.di.noframework.services.message;

import com.java.learn.di.noframework.exceptions.MessageServiceException;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public interface MessageService {

    void sendMessage(String message,String recipientAddress) throws MessageServiceException;
}
