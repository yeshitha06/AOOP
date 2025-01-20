package com.sis.interfaces;

import com.sis.models.Student;

public interface IStudentManagement {
    void addStudent(Student student);
    Student getStudentById(int id);
}

