package com.student.StudentRestApi.exception;

public class TeachersNotFoundException extends RuntimeException{
    public TeachersNotFoundException(String message){
        super(message);
    }
}
