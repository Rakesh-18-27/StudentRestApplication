package com.student.StudentRestApi.controller;

import com.student.StudentRestApi.model.StudentModel;
import com.student.StudentRestApi.model.TeacherModel;
import com.student.StudentRestApi.service.StudentService;
import com.student.StudentRestApi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/getAll")
    public List<TeacherModel> getAll(){

        return teacherService.getAll();
    }

    @PostMapping("/addTeacher")
    public List<TeacherModel> addStudent(@RequestBody TeacherModel teacherModel){
        return teacherService.addStudent(teacherModel);
    }

    @GetMapping("/getById/{id}")
    public TeacherModel getById(@PathVariable Integer id){

        return teacherService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public List<TeacherModel> deleteById(@PathVariable Integer id){

        return teacherService.deleteById(id);
    }
    @GetMapping("/teachersByyear/{year}")
    public List<TeacherModel> teachersByyear(@PathVariable String year){
return teacherService.getTeachersByYear(year);
    }
    @GetMapping("/getAttendedTeachersBySubject/{subject}")
    public TeacherModel getTeacherBySubject(@PathVariable String subject){
return  teacherService.getTeacherBySubject(subject);
    }
    @GetMapping("/getTeachersTeaches3Subjects")
    public List<TeacherModel> getTeachersTeaches3Subjects(){

        return teacherService.getTeachersTeachesThree();
    }


}


