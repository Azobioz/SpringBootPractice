package ru.practice.springbootpractice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.practice.springbootpractice.model.Student;
import ru.practice.springbootpractice.repository.InMemoryStudentDAO;
import ru.practice.springbootpractice.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        repository.deleteStudentByEmail(email);
    }
}
