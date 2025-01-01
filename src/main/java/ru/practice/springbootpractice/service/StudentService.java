package ru.practice.springbootpractice.service;

import org.springframework.stereotype.Service;
import ru.practice.springbootpractice.model.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudentByEmail(String email);

}
