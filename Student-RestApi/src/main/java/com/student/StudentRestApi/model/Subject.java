package com.student.StudentRestApi.model;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public class Subject {
    private String subjectId;
    @NotEmpty(message = "subject name cannot be empty")
    private String subjectName;
    @Valid
    private Branch branch;

    public Subject(String subjectId, String subjectName, Branch branch) {
        super();
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.branch = branch;
    }

    public Subject() {

        super();
    }

    public String getSubjectId() {

        return subjectId;
    }

    public void setSubjectId(String subjectId) {

        this.subjectId = subjectId;
    }

    public String getSubjectName() {

        return subjectName;
    }

    public void setSubjectName(String subjectName) {

        this.subjectName = subjectName;
    }

    public Branch getBranch() {

        return branch;
    }

    public void setBranch(Branch branch) {

        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", branch=" + branch + ", marks="
                + "" + "]";
    }


}
