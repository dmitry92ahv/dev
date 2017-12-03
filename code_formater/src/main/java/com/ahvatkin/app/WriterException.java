package com.ahvatkin.app;

public class WriterException extends Exception {

    public WriterException(final Throwable cause) {
        super(cause);
    }

    public WriterException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
