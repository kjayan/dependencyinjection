package com.java.learn.di.noframework;

import com.java.learn.di.noframework.client.MyClient;
import com.java.learn.di.noframework.injector.MessageServiceInjector;
import com.java.learn.di.noframework.injector.impl.EmailServiceInjectorImpl;
import com.java.learn.di.noframework.injector.impl.SMSServiceInjectorImpl;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MainClass {

    public static void main(String[] args) throws Exception {

        String message = "This is a test message";
        String recipientEmail = "abc@def.com";
        String recipientPhone = "1234567890";

        MessageServiceInjector injector;
        MyClient myClient;

        //Send Email
        injector = new EmailServiceInjectorImpl();
        myClient = injector.getClient();
        myClient.processMessage(message,recipientEmail);


        //Send SMS
        injector = new SMSServiceInjectorImpl();
        myClient = injector.getClient();
        myClient.processMessage(message,recipientPhone);

    }
}
