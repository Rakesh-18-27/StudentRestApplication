package com.student.StudentRestApi.service;

import com.student.StudentRestApi.model.Subject;
import com.student.StudentRestApi.model.TeacherModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TeacherServiceImpl implements TeacherService{

    List<TeacherModel> teachers=new ArrayList<>();
    @Override
    public List<TeacherModel> addStudent(TeacherModel teacherModel) {
        teachers.add(teacherModel);
        return teachers;
    }

    @Override
    public List<TeacherModel> getAll() {
        return teachers;
    }

    @Override
    public List<TeacherModel> deleteById(Integer id) {
TeacherModel deletedTeacher=teachers.stream().filter(teacherModel -> teacherModel.getId()==id).collect(Collectors.toList()).get(0);
       teachers.remove(deletedTeacher);
        return teachers;
    }

    @Override
    public TeacherModel getById(Integer id) {

        return teachers.stream()
                .filter(teacherModel -> teacherModel.getId()==id).collect(Collectors.toList()).get(0);

    }

    @Override
    public List<TeacherModel> getTeachersByYear(String year) {
        return teachers.stream()
                .filter(teacher->teacher.getSubjects().stream().anyMatch(sub->sub.getBranch().getBranchYear().equalsIgnoreCase(year)))
                .collect(Collectors.toList());
    }

    @Override
    public TeacherModel getTeacherBySubject(String subject) {
        return teachers.stream().filter(teacher -> teacher.getAttendence().stream().anyMatch(i->i.getAttendedDate().equalsIgnoreCase(LocalDate.now().toString())))
                .filter(teacher->teacher.getSubjects().stream().anyMatch(sub->sub.getSubjectName().equalsIgnoreCase(subject))).collect(Collectors.toList()).get(0);

    }

    @Override
    public List<TeacherModel> getTeachersTeachesThree() {
        List<TeacherModel> teachersTeachesThree= teachers.stream()
                .filter(teacher -> {
                    boolean flag = false;
                    int count = 0;
                    for (Subject s : teacher.getSubjects()) {
                        if (s.getBranch().getBranchYear().equalsIgnoreCase("2")) {
                            count++;
                        }
                    }
                    return count > 2 ? true : false;
                }).collect(Collectors.toList());

        return teachersTeachesThree;
    }
}
