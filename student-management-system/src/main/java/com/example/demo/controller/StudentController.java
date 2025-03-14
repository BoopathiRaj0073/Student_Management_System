package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Display list of students
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    // Show form to create a new student
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "create_student";
    }

    // Save new student
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // Show form to edit existing student
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    // Update student
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        studentService.updateStudent(id, student);
        return "redirect:/students";
    }

    // Delete student
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
