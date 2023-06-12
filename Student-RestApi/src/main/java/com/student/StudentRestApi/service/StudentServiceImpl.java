package com.student.StudentRestApi.service;

import com.student.StudentRestApi.model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    List<StudentModel> students=new ArrayList<>();

    @Override
    public List<StudentModel> addStudent(StudentModel studentModel) {
        students.add(studentModel);
        return students;
    }

    @Override
    public List<StudentModel> getAll() {
       return students;
    }

    @Override
    public List<StudentModel> deleteById(Integer id) {
        StudentModel studentModels=students.stream().filter(studentModel -> studentModel.getStudentId()==id)
                .collect(Collectors.toList()).get(0);
        if(studentModels!=null){
            students.remove(studentModels);
        }
        return students;
    }

    @Override
    public StudentModel getById(Integer id) {
        return students.stream()
                .filter(student -> student.getStudentId()==id).collect(Collectors.toList()).get(0);

    }

    @Override
    public List<StudentModel> getStudentsByYear(String year) {
        return students.stream()
                .filter(student -> student.getBranch().getBranchYear().equalsIgnoreCase(year))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAttendenceByYearAndBranch(String year, String branch) {
       return students.stream()
                .filter(student -> student.getBranch().getBranchName().equalsIgnoreCase(branch)&& student.getBranch().getBranchYear().equalsIgnoreCase(year))
                .filter(student -> student.getAttendence().stream().anyMatch(i->i.getAttendedDate().equalsIgnoreCase(LocalDate.now().toString())&&i.getIsAttended()))
                .map(studentModel -> {
                    return studentModel.getStudentName();
                }).collect(Collectors.toList());
    }

    @Override
    public List<StudentModel> getFailedStudentsByYear(String year) {
        return students.stream()
                .filter(student->student.getBranch().getBranchYear().equals(year))
                .filter(studentModel -> studentModel.getMarks().getMarks().keySet().stream().anyMatch(str->studentModel.getMarks().getMarks().get(str)<36))
                .collect(Collectors.toList());
    }
}
