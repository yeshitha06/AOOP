package com.sis.interfaces;

import com.sis.models.Course;

public interface ICourseManagement {
    void addCourse(Course course);
    Course getCourseById(int id);
}
