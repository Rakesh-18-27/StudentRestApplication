package com.student.StudentRestApi.exception;

public class SubjectNotFoundException extends RuntimeException {

    public SubjectNotFoundException(String message){
super(message);
    }

    public SubjectNotFoundException() {
    }
}
