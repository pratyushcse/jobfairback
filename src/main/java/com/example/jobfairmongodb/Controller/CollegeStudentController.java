package com.example.jobfairmongodb.Controller;

import com.example.jobfairmongodb.Model.CollegeStudent;
import com.example.jobfairmongodb.Service.CollegeStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class CollegeStudentController {
    @Autowired
    private CollegeStudentService service;

    // Create Student (POST)
    @PostMapping
    public CollegeStudent createStudent(@RequestBody CollegeStudent student) {
        return service.saveStudent(student);
    }

    // Get All Students (GET)
    @GetMapping
    public List<CollegeStudent> getAllStudents() {
        return service.getAllStudents();
    }

    // Get Student by ID (GET)
    @GetMapping("/{id}")
    public Optional<CollegeStudent> getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }

    // Delete Student by ID (DELETE)
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
        return "Student with ID " + id + " deleted successfully!";
    }
}
