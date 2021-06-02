package com.interview.interview.ExceptionHandler;

public class ConditionFailed extends RuntimeException {
    public ConditionFailed(String message) {
        super(message);
    }
}
