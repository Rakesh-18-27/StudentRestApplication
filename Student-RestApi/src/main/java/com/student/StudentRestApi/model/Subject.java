package com.student.StudentRestApi.model;


public class Subject {
    private String subjectId;
    private String subjectName;
    private Branch branch;
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

    public Subject(String subjectId, String subjectName, Branch branch) {
        super();
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.branch = branch;
    }

    public Subject() {
        super();
    }
    @Override
    public String toString() {
        return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", branch=" + branch + ", marks="
                + "" + "]";
    }


}
