package com.sample.Entity;

import org.springframework.stereotype.Component;


public class Student {
    private int rollNumber;
    private String name;
    private String std;

    public Student(int rollNumber, String name, String std) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.std = std;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
}
