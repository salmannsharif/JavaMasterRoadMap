//package com.training.Junit.testing;
//
//import com.training.Junit.entity.Student;
//import com.training.Junit.repository.StudentRepository;
//import com.training.Junit.service.StudentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//public class StudentServiceTest {
//
//    private StudentRepository studentRepository;
//    private StudentService studentService;
//
//
//    @BeforeEach
//    public void setUp(){
//        studentRepository = mock(StudentRepository.class);
//        studentService = new StudentService(studentRepository);
//    }
//
//    @Test
//    public void testGetAllStudent(){
//
//        List<Student> allStudent = new ArrayList<>(Arrays.asList(
//                new Student(1L, "Salman", 22, "salmansharif@123"),
//                new Student(2L, "Rishaba", 29, "rishaba@123")
//        ));
//
//        when(studentRepository.findAll()).thenReturn(allStudent);
//
//        var students = studentService.getAllStudent();
//        assertEquals(2, students.size());
//        verify(studentRepository, times(1)).findAll();
//    }
//
//    @Test
//    public void testGetStudentById(){
//        Student student = new Student(1L, "Salman", 22, "salmansharif@123");
//
//        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//
//        var foundStudent = studentService.getStudentById(1L);
//        assertEquals(student.getId(), foundStudent.getId());
//        assertNotNull(foundStudent);
//        assertEquals("Salman", foundStudent.getName());
//        verify(studentRepository, times(1)).findById(1L);
//    }
//
//    @Test
//    public void testAddStudent(){
//        Student student = new Student(null, "Salman", 22, "salmansharif@123");
//        when((studentRepository.save(student))).thenReturn(
//                new Student(1L, "Salman", 22, "salmansharif")
//        );
//
//        var savedStudent = studentService.addStudent(student);
//        assertEquals(1L, savedStudent.getId());
//        assertEquals("Salman", savedStudent.getName());
//        verify(studentRepository, times(1)).save(student);
//    }
//
//    @Test
//    public void testDeleteById(){
//        doNothing().when(studentRepository).deleteById(1L);
//        studentService.deleteStudentById(1L);
//        verify(studentRepository, times(1)).deleteById(1L);
//    }
//
//
//}
//
