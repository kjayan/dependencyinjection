package com.java.learn.di.withframework;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.java.learn.di.withframework.client.MyClient;
import com.java.learn.di.withframework.injector.AppInjector;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MainClass {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        MyClient client = injector.getInstance(MyClient.class);
        client.sendMessage("Hello World","abc@facebook.com");
    }
}
