package com.example.jobfairmongodb.Repository;


import com.example.jobfairmongodb.Model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
}
