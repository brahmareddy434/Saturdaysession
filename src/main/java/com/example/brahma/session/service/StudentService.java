package com.example.brahma.session.service;

import com.example.brahma.session.entity.Student;
import com.example.brahma.session.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String savestudent(Student student) {
        Student student1 = new Student();
        student1.setId(student.getId());
        student1.setName(student.getName());
        studentRepository.save(student1);
        return "Student registered Successfully";
    }
}
