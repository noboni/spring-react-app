package com.interview.interview.ExceptionHandler;

public class BadRequest extends RuntimeException {
    public BadRequest(String message){
        super(message);
    }
}
