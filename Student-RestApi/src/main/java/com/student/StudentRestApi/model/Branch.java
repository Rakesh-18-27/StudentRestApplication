package com.student.StudentRestApi.model;
public class Branch {
    private Integer branchId;
    private String branchName;
    private String branchYear;
    public Integer getBranchId() {
        return branchId;
    }
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getBranchYear() {
        return branchYear;
    }
    public void setBranchYear(String branchYear) {
        this.branchYear = branchYear;
    }
    public Branch(Integer branchId, String branchName, String branchYear) {
        super();
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchYear = branchYear;
    }
    @Override
    public String toString() {
        return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchYear=" + branchYear + "]";
    }
    public Branch() {
        super();
    }

}
