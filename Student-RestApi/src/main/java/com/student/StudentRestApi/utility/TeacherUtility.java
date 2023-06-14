package com.student.StudentRestApi.utility;

import com.student.StudentRestApi.exception.NoOneFoundWithThisId;
import com.student.StudentRestApi.exception.StudentsNotFoundException;
import com.student.StudentRestApi.exception.TeachersNotFoundException;
import com.student.StudentRestApi.exception.ValidYearException;
import com.student.StudentRestApi.model.StudentModel;
import com.student.StudentRestApi.model.TeacherModel;

import java.util.List;
import java.util.Objects;

public class TeacherUtility {
    public static void isValidYear(String year){
        if(year.equalsIgnoreCase("1")||year.equalsIgnoreCase("2")){

        }else{
            throw new ValidYearException(year+" is invalid year");
        }
    }
    public static void  isValidId(Integer id,List<TeacherModel> teacherModels){
        if(teacherModels.isEmpty()){
            throw new NoOneFoundWithThisId("No Teacher found with the id no:"+id);
        }
    }

    public static void isTeachersEmpty(List<TeacherModel> teachers){
        if(Objects.equals(0,teachers.size())){
            throw new TeachersNotFoundException("Please insert Teachers first");
        }
    }
}
