package com.student.StudentRestApi.service;

import com.student.StudentRestApi.model.StudentModel;

import java.util.List;

public interface StudentService {

    List<StudentModel> addStudent(StudentModel studentModel);
    List<StudentModel> getAll();
    List<StudentModel> deleteById(Integer id);
    StudentModel getById(Integer id);

    List<StudentModel> getStudentsByYear(String year);


    List<String> getAttendenceByYearAndBranch(String year,String branch);

    List<StudentModel> getFailedStudentsByYear(String year);

}
