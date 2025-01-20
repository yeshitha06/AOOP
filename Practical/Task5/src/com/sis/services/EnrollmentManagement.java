package com.sis.services;

import com.sis.interfaces.IEnrollmentManagement;
import com.sis.models.Student;
import com.sis.models.Course;

public class EnrollmentManagement implements IEnrollmentManagement {
    private final StudentManagement studentManagement;
    private final CourseManagement courseManagement;

    public EnrollmentManagement(StudentManagement studentManagement, CourseManagement courseManagement) {
        this.studentManagement = studentManagement;
        this.courseManagement = courseManagement;
    }

    @Override
    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = studentManagement.getStudentById(studentId);
        Course course = courseManagement.getCourseById(courseId);

        if (student != null && course != null) {
            student.enrollInCourse(courseId);
            course.enrollStudent(studentId);
            System.out.println("Student " + student.getName() + " enrolled in course " + course.getName());
        } else {
            System.out.println("Enrollment failed. Student or course not found.");
        }
    }
}
