package com.student.StudentRestApi.exception;

public class NotValidException extends RuntimeException{
    public NotValidException(String message){
        super(message);
    }

    public NotValidException() {
    }
}
