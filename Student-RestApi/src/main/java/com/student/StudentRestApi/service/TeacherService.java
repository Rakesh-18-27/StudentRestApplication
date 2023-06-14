package com.student.StudentRestApi.service;

import com.student.StudentRestApi.model.StudentModel;
import com.student.StudentRestApi.model.TeacherModel;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public interface TeacherService {
    List<TeacherModel> addStudent(TeacherModel teacherModel);
    List<TeacherModel> getAll();
    List<TeacherModel> deleteById(Integer id);
    TeacherModel getById(@NotEmpty(message = "id cannot be empty") Integer id);

    List<TeacherModel> getTeachersByYear(String year);

    TeacherModel getTeacherBySubject(String subject);

    List<TeacherModel> getTeachersTeachesThree();
}
