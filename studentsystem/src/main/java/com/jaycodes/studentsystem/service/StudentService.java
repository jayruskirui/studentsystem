package com.jaycodes.studentsystem.service;

import com.jaycodes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
