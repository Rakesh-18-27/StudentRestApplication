package com.student.StudentRestApi.utility;

import com.student.StudentRestApi.exception.StudentsNotFoundException;
import com.student.StudentRestApi.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class StudentUtility {
    public static void checkIsStudentsEmpty(List<StudentModel> students){
        if(Objects.equals(0,students.size())){
            throw new StudentsNotFoundException("Please insert Students first");
        }
    }


}
