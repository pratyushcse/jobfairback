package com.example.jobfairmongodb.Repository;

import com.example.jobfairmongodb.Model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
    // You can add custom queries here if needed
}
