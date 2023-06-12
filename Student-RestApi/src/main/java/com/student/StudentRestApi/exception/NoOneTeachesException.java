package com.student.StudentRestApi.exception;

public class NoOneTeachesException extends RuntimeException {
    public NoOneTeachesException(String message){
        super(message);
    }
}
