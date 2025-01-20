package com.sis.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Integer> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(int courseId) {
        enrolledCourses.add(courseId);
    }
}
