package com.java.learn.di.noframework.services.injector.impl;

import com.java.learn.di.noframework.services.client.impl.MyDIAppClientImpl;
import com.java.learn.di.noframework.services.client.Client;
import com.java.learn.di.noframework.services.injector.MessageServiceInjector;
import com.java.learn.di.noframework.services.message.impl.SMSServiceImpl;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class SMSServiceInjectorImpl implements MessageServiceInjector {
    public Client getClient() {
        return new MyDIAppClientImpl(new SMSServiceImpl());
    }
}
