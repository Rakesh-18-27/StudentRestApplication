package com.student.StudentRestApi.controller;


import com.student.StudentRestApi.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(StudentsNotFoundException.class)
    public ResponseEntity<String> handleStudentsNotFoundexception(StudentsNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(SubjectNotFoundException.class)
    public ResponseEntity<String> handleSubjectNotFoundException(SubjectNotFoundException subjectNotFoundException){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(subjectNotFoundException.getMessage());
    }

    @ExceptionHandler(NoOneTeachesException.class)
    public ResponseEntity<String> handleNoOneTeachesException(NoOneTeachesException noOneTeachesException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(noOneTeachesException.getMessage());
    }

    @ExceptionHandler(NoFailedStudentsException.class)
    public ResponseEntity<String> handleNoFailedStudentsException(NoFailedStudentsException noFailedStudentsException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(noFailedStudentsException.getMessage());
    }

    @ExceptionHandler(NoOneFoundWithThisId.class)
    public ResponseEntity<String> handleNoOneFoundWithThisIdException(NoOneFoundWithThisId noOneFoundWithThisId){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(noOneFoundWithThisId.getMessage());
    }

    @ExceptionHandler(ValidYearException.class)
    public ResponseEntity<String> handleValidYearException(ValidYearException validYearException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(validYearException.getMessage());
    }

    @ExceptionHandler(NotValidException.class)
    public ResponseEntity<String>  handleNotValidException(NotValidException notValidException){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(notValidException.getMessage());
    }

    @ExceptionHandler(TeachersNotFoundException.class)
    public ResponseEntity<String> handleTeachersNotFoundException(TeachersNotFoundException teachersNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(teachersNotFoundException.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult=ex.getBindingResult();
       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body( bindingResult.getAllErrors().get(0).getDefaultMessage());
    }
}
