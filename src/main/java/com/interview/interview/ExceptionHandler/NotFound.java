package com.interview.interview.ExceptionHandler;

public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }
}
