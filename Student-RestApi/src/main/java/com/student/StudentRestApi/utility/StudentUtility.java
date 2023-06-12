package com.student.StudentRestApi.utility;

import com.student.StudentRestApi.exception.NoOneFoundWithThisId;
import com.student.StudentRestApi.exception.StudentsNotFoundException;
import com.student.StudentRestApi.exception.ValidYearException;
import com.student.StudentRestApi.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;


public class StudentUtility {
    public static void checkIsStudentsEmpty(List<StudentModel> students){
        if(Objects.equals(0,students.size())){
            throw new StudentsNotFoundException("Please insert Students first");
        }
    }

    public static void isValidYear(String year){
        if(!year.equalsIgnoreCase("1")||!year.equalsIgnoreCase("2")){
            throw new ValidYearException(year+"  invalid year");
        }
    }

    public static void  isValidId(Integer id,List<StudentModel> studentModels){
        if(studentModels.isEmpty()){
            throw new NoOneFoundWithThisId("No Student found with the id no:"+id);
        }
    }

}
