package com.student.StudentRestApi.model;
import java.util.List;
public class TeacherModel {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String teacherName;
    private String teacherEmail;
    private List<Subject> subjects;
    private List<Attendence> attendence;
    @Override
    public String toString() {
        return "Teacher [teacherName=" + teacherName + ", teacherEmail=" + teacherEmail + ", subjects=" + subjects
                + ", attendence=" + attendence + "]";
    }
    public TeacherModel() {
        super();
    }
    public TeacherModel(Integer id,String teacherName, String teacherEmail, List<Subject> subjects, List<Attendence> attendence) {
        super();
        this.id=id;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.subjects = subjects;
        this.attendence = attendence;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherEmail() {
        return teacherEmail;
    }
    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }
    public List<Subject> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    public List<Attendence> getAttendence() {
        return attendence;
    }
    public void setAttendence(List<Attendence> attendence) {
        this.attendence = attendence;
    }

}
