package com.java.learn.di.noframework.injector.impl;

import com.java.learn.di.noframework.client.MyClient;
import com.java.learn.di.noframework.client.impl.MyClientImpl;
import com.java.learn.di.noframework.injector.MessageServiceInjector;
import com.java.learn.di.services.messages.impl.EmailServiceImpl;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class EmailServiceInjectorImpl implements MessageServiceInjector {

    public MyClient getClient() {
        return new MyClientImpl(new EmailServiceImpl());
    }
}
