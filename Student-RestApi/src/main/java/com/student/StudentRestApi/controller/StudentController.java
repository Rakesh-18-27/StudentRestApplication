package com.student.StudentRestApi.controller;
import java.util.List;

import com.student.StudentRestApi.exception.NotValidException;
import com.student.StudentRestApi.model.StudentModel;
import com.student.StudentRestApi.model.TeacherModel;
import com.student.StudentRestApi.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/getAll")
    public List<StudentModel> getAll(){

        return studentService.getAll();
    }

    @PostMapping("/addStudent")
    public List<StudentModel> addStudent(@Valid @RequestBody StudentModel studentModel, BindingResult bindingResult){

        return studentService.addStudent(studentModel,bindingResult);
    }

    @GetMapping("/getById/{id}")
    public StudentModel getById(@PathVariable  Integer id){

        return studentService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public List<StudentModel> deleteById(@PathVariable Integer id){

        return studentService.deleteById(id);
    }

    @GetMapping("/getStudentsByYear/{year}")
    public List<StudentModel> getStudentsByYear(@PathVariable String year){
            return studentService.getStudentsByYear(year);
    }

    @GetMapping("/getAttendenceByYearAndBranch/{year}/{branch}")
    public List<String> getAttendenceByYearAndBranch(@PathVariable String year,@PathVariable String branch){
            return studentService.getAttendenceByYearAndBranch(year,branch);
    }

    @GetMapping("/getFailedStudentsByYear/{year}")
    public List<StudentModel> getFailedStudentsByYear(@PathVariable String year) {
        return studentService.getFailedStudentsByYear(year);

    }

}
