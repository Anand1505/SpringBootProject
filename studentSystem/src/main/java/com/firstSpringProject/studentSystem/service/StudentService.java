package com.firstSpringProject.studentSystem.service;

import com.firstSpringProject.studentSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
