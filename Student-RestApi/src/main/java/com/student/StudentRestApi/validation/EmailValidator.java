package com.student.StudentRestApi.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailCustomValidation,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean flag=false;
        String regex="^\\w+@[a-zA-Z_]+\\.[a-zA-Z]{2,3}$";
        if(value.matches(regex)){
            flag=true;
        }
        return flag;
    }
}
