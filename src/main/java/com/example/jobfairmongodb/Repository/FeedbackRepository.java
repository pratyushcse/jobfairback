package com.example.jobfairmongodb.Repository;


import com.example.jobfairmongodb.Model.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
