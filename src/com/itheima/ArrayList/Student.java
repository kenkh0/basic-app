package com.itheima.ArrayList;

public class Student {
    private int stdId ;
    private String stdName ;
    private int stdAge ;
    private String stdClass;

    public Student(){

    }

    public Student(int stdId, String stdName, int stdAge, String stdClass) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdClass = stdClass;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public String getStdClass() {
        return stdClass;
    }

    public void setStdClass(String stdClass) {
        this.stdClass = stdClass;
    }
}
