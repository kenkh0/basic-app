package com.itheima.d14_this;

public class Student {
    private String name;
    private String SchoolName;

    public Student() {
    }
    public Student(String name) {
        this(name,"schoolName");

    }

    public Student(String name, String schoolName) {
        this.name = name;
        SchoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
