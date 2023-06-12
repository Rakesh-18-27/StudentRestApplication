package com.student.StudentRestApi.model;

import java.util.Map;

public class Marks {
    private Map<String,Integer> marks;

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Marks(Map<String, Integer> marks) {
        super();
        this.marks = marks;
    }

    public Marks() {
        super();
    }

    @Override
    public String toString() {
        return "Marks [marks=" + marks + "]";
    }



}
