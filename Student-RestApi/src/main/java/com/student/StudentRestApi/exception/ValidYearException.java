package com.student.StudentRestApi.exception;

public class ValidYearException extends RuntimeException{
    public ValidYearException(String message){
        super(message);
    }

    public ValidYearException() {
    }
}
