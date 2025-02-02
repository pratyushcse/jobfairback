package com.example.jobfairmongodb.Service;

import com.example.jobfairmongodb.Model.CollegeStudent;
import com.example.jobfairmongodb.Repository.CollegeStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeStudentService {
    @Autowired
    private CollegeStudentRepository repository;

    public CollegeStudent saveStudent(CollegeStudent student) {
        return repository.save(student);
    }

    public List<CollegeStudent> getAllStudents() {
        return repository.findAll();
    }

    public Optional<CollegeStudent> getStudentById(String id) {
        return repository.findById(id);
    }

    public void deleteStudent(String id) {
        repository.deleteById(id);
    }
}
