package com.java.learn.di.noframework;

import com.java.learn.di.noframework.services.client.Client;
import com.java.learn.di.noframework.services.injector.MessageServiceInjector;
import com.java.learn.di.noframework.services.injector.impl.EmailServiceInjectorImpl;
import com.java.learn.di.noframework.services.injector.impl.SMSServiceInjectorImpl;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MainClass {

    public static void main(String[] args) throws Exception {

        String message = "This is a test message";
        String recipientEmail = "abc@def.com";
        String recipientPhone = "1234567890";

        MessageServiceInjector injector = null;
        Client client = null;

        //Send Email
        injector = new EmailServiceInjectorImpl();
        client = injector.getClient();
        client.processMessage(message,recipientEmail);


        //Send SMS
        injector = new SMSServiceInjectorImpl();
        client = injector.getClient();
        client.processMessage(message,recipientPhone);

    }
}
