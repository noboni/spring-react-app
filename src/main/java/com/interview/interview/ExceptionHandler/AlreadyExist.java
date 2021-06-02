package com.interview.interview.ExceptionHandler;

public class AlreadyExist extends RuntimeException {
    public AlreadyExist(String message) {
        super(message);
    }
}
