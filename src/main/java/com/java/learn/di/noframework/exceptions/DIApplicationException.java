package com.java.learn.di.noframework.exceptions;

/**
 * Created by jayan.kuttagupthan on 01/12/16.
 */
public class DIApplicationException extends Exception{

    public DIApplicationException() {
        super();
    }

    public DIApplicationException(String message) {
        super(message);
    }

    public DIApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DIApplicationException(Throwable cause) {
        super(cause);
    }
}
