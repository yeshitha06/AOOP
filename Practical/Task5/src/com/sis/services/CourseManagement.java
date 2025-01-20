package com.sis.services;

import com.sis.interfaces.ICourseManagement;
import com.sis.models.Course;

import java.util.HashMap;
import java.util.Map;

public class CourseManagement implements ICourseManagement {
    private final Map<Integer, Course> courses = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public Course getCourseById(int id) {
        return courses.get(id);
    }
}
