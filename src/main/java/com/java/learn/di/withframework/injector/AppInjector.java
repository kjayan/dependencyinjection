package com.java.learn.di.withframework.injector;

import com.google.inject.AbstractModule;
import com.java.learn.di.services.messages.MessageService;
import com.java.learn.di.services.messages.impl.FacebookServiceImpl;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class AppInjector extends AbstractModule{

    @Override
    protected void configure() {
        //bind(MessageService.class).to(EmailServiceImpl.class);
        //bind(MessageService.class).to(SMSServiceImpl.class);
        bind(MessageService.class).to(FacebookServiceImpl.class);
    }
}
