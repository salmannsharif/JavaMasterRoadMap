package com.training.Junit.service;

import com.training.Junit.entity.Student;
import com.training.Junit.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(long id){
        return studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudentById(long id){
        studentRepository.deleteById(id);
    }

}
