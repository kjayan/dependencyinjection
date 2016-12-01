package com.java.learn.di.noframework.services.client;

import com.java.learn.di.noframework.exceptions.DIApplicationException;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public interface Client {

    void processMessage(String message, String recipientAddress) throws DIApplicationException;
}
