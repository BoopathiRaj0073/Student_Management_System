package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // Constructor-based Dependency Injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Save a Student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get Student by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update Student
    public Student updateStudent(Long id, Student studentDetails) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent == null) {
            return null; // Handle case when student is not found
        }
        
        // Update fields
        existingStudent.setFirstName(studentDetails.getFirstName());
        existingStudent.setLastName(studentDetails.getLastName());
        existingStudent.setEmail(studentDetails.getEmail());

        return studentRepository.save(existingStudent);
    }

    // Delete a Student
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
