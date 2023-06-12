package com.student.StudentRestApi.model;

public class Attendence {
    private String attendedDate;
    private Boolean isAttended;
    @Override
    public String toString() {
        return "Attendence [attendedDate=" + attendedDate + ", isAttended=" + isAttended + "]";
    }
    public Attendence() {
        super();
    }
    public Attendence(String attendedDate, Boolean isAttended) {
        super();
        this.attendedDate = attendedDate;
        this.isAttended = isAttended;
    }
    public String getAttendedDate() {
        return attendedDate;
    }
    public void setAttendedDate(String attendedDate) {
        this.attendedDate = attendedDate;
    }
    public Boolean getIsAttended() {
        return isAttended;
    }
    public void setIsAttended(Boolean isAttended) {
        this.isAttended = isAttended;
    }
}
