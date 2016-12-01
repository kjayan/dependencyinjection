package com.java.learn.di.noframework.exceptions;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class MessageServiceException extends Exception {

    public MessageServiceException() {
        super();
    }

    public MessageServiceException(String message) {
        super(message);
    }

    public MessageServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageServiceException(Throwable cause) {
        super(cause);
    }
}
