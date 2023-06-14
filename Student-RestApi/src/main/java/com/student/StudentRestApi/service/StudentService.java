package com.student.StudentRestApi.service;

import com.student.StudentRestApi.model.StudentModel;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface StudentService {

    List<StudentModel> addStudent(StudentModel studentModel, BindingResult bindingResult);
    List<StudentModel> getAll();
    List<StudentModel> deleteById(Integer id);
    StudentModel getById(@NotNull(message = "id cannot bel null") Integer id);

    List<StudentModel> getStudentsByYear(String year);


    List<String> getAttendenceByYearAndBranch(String year,String branch);

    List<StudentModel> getFailedStudentsByYear(String year);

}
