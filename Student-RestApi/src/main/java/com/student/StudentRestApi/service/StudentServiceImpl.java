package com.student.StudentRestApi.service;

import com.student.StudentRestApi.exception.NoOneFoundWithThisId;
import com.student.StudentRestApi.exception.NoOneTeachesException;
import com.student.StudentRestApi.exception.StudentsNotFoundException;
import com.student.StudentRestApi.model.StudentModel;
import com.student.StudentRestApi.utility.StudentUtility;
import com.student.StudentRestApi.utility.TeacherUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    public List<StudentModel> getAll() throws StudentsNotFoundException {
        StudentUtility.checkIsStudentsEmpty(students);
        return students;
    }

    @Override
    public List<StudentModel> deleteById(Integer id) {
        StudentUtility.checkIsStudentsEmpty(students);
        StudentModel studentModels=students.stream().filter(studentModel -> Objects.equals(studentModel.getStudentId(), id))
                .collect(Collectors.toList()).get(0);
        if(studentModels!=null){
            students.remove(studentModels);
        }
        return students;
    }

    @Override
    public StudentModel getById(Integer id) {
        StudentUtility.checkIsStudentsEmpty(students);
       List<StudentModel> studentModels= students.stream()
                .filter(student -> student.getStudentId()==id).collect(Collectors.toList());
       StudentUtility.isValidId(id,studentModels);
       return studentModels.get(0);
    }

    @Override
    public List<StudentModel> getStudentsByYear(String year) {
        StudentUtility.checkIsStudentsEmpty(students);
        List<StudentModel> studentModels= students.stream()
                .filter(student -> student.getBranch().getBranchYear().equalsIgnoreCase(year))
                .collect(Collectors.toList());
        if(studentModels.isEmpty()){
            StudentUtility.isValidYear(year);
        }
            return studentModels;

    }

    @Override
    public List<String> getAttendenceByYearAndBranch(String year, String branch) {
        StudentUtility.checkIsStudentsEmpty(students);
       return students.stream()
                .filter(student -> student.getBranch().getBranchName().equalsIgnoreCase(branch)&& student.getBranch().getBranchYear().equalsIgnoreCase(year))
                .filter(student -> student.getAttendence().stream().anyMatch(i->i.getAttendedDate().equalsIgnoreCase(LocalDate.now().toString())&&i.getIsAttended()))
                .map(studentModel -> {
                    return studentModel.getStudentName();
                }).collect(Collectors.toList());
    }

    @Override
    public List<StudentModel> getFailedStudentsByYear(String year) {
        StudentUtility.checkIsStudentsEmpty(students);
        List<StudentModel> studentModels= students.stream()
                .filter(student->student.getBranch().getBranchYear().equals(year))
                .filter(studentModel -> studentModel.getMarks().getMarks().keySet().stream().anyMatch(str->studentModel.getMarks().getMarks().get(str)<36))
                .collect(Collectors.toList());
        if(studentModels.isEmpty()){
            throw new NoOneTeachesException("No Failed Students in the year "+year);
        }
        return studentModels;
    }
}
