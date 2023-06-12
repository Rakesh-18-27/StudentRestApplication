package com.student.StudentRestApi.model;

import java.util.List;

public class StudentModel {
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private Branch branch;

    private Marks marks;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    private List<Attendence> attendence;
    public Marks getMarks() {
        return marks;
    }
    public void setMarks(Marks marks) {
        this.marks = marks;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<Attendence> getAttendence() {
        return attendence;
    }
    public void setAttendence(List<Attendence> attendence) {
        this.attendence = attendence;
    }
    public StudentModel(Integer studentId,String studentName, String studentEmail, Branch branch,
                   List<Attendence> attendence,Marks marks) {
        super();
        this.studentId=studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.branch = branch;
        this.attendence = attendence;
        this.marks=marks;

    }
    public StudentModel() {
        super();
    }
    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", branch=" + branch
                + ", subjects=" + "" + ", attendence=" + attendence + ", marks="+marks+"]";
    }
}
