package com.sis.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private List<Integer> enrolledStudents;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(int studentId) {
        enrolledStudents.add(studentId);
    }
}
