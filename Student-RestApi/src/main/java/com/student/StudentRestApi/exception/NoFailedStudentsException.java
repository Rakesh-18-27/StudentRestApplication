package com.student.StudentRestApi.exception;

public class NoFailedStudentsException extends RuntimeException{
    public NoFailedStudentsException(String message){
        super(message);
    }
}
