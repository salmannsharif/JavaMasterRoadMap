//package com.training.Junit.controller;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    private final StudentService studentService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @PostMapping
//    public Student addStudent(Student student) {
//        return studentService.addStudent(student);
//    }
//
//    @GetMapping("/{id}")
//    public Student getStudentById(@PathVariable long id) {
//        return studentService.getStudentById(id);
//    }
//
//    @GetMapping
//    public List<Student> getAllStudent() {
//        return studentService.getAllStudent();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudentById(long id) {
//        studentService.deleteStudentById(id);
//    }
//
//}
