package com.ust.redis_crud_demo.service;

import com.ust.redis_crud_demo.model.Student;
import com.ust.redis_crud_demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        return StreamSupport.stream(studentRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }
    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }
}
