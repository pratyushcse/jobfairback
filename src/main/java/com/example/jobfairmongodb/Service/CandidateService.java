package com.example.jobfairmongodb.Service;

import com.example.jobfairmongodb.Model.Candidate;
import com.example.jobfairmongodb.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    // Save a new candidate
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    // Get all candidates
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    // Get a candidate by ID
    public Optional<Candidate> getCandidateById(String id) {
        return candidateRepository.findById(id);
    }

    // Update a candidate's information
    public Candidate updateCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    // Delete a candidate by ID
    public void deleteCandidate(String id) {
        candidateRepository.deleteById(id);
    }
}
