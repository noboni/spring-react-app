package com.interview.interview.ExceptionHandler;

public class InternalServerError extends RuntimeException {
    public InternalServerError(String message){
        super(message);
    }
}
