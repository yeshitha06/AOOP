package com.siss;

import com.sis.models.Student;
import com.sis.models.Course;
import com.sis.services.StudentManagement;
import com.sis.services.CourseManagement;
import com.sis.services.EnrollmentManagement;

public class Main {
    public static void main(String[] args) {
        // Initialize management services
        StudentManagement studentManagement = new StudentManagement();
        CourseManagement courseManagement = new CourseManagement();
        EnrollmentManagement enrollmentManagement = new EnrollmentManagement(studentManagement, courseManagement);

        // Add students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);

        // Add courses
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "Physics");
        courseManagement.addCourse(course1);
        courseManagement.addCourse(course2);

        // Enroll students in courses
        enrollmentManagement.enrollStudentInCourse(1, 101); // Alice in Mathematics
        enrollmentManagement.enrollStudentInCourse(2, 102); // Bob in Physics
        enrollmentManagement.enrollStudentInCourse(1, 102); // Alice in Physics

        // Display enrolled courses for Alice
        System.out.println("Courses Alice is enrolled in: " + student1.getEnrolledCourses());

        // Display enrolled students for Mathematics
        System.out.println("Students enrolled in Mathematics: " + course1.getEnrolledStudents());
    }
}
