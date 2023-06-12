package com.student.StudentRestApi.exception;

public class NoOneFoundWithThisId extends RuntimeException{
    public NoOneFoundWithThisId(String message){
        super(message);
    }
}
