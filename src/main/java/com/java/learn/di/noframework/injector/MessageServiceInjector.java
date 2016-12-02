package com.java.learn.di.noframework.injector;

import com.java.learn.di.noframework.client.MyClient;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public interface MessageServiceInjector {

    MyClient getClient();
}
