package com.example.jobfairmongodb.Repository;

import com.example.jobfairmongodb.Model.CollegeStudent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeStudentRepository extends MongoRepository<CollegeStudent, String> {
}
