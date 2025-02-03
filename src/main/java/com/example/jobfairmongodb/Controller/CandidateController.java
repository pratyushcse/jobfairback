package com.example.jobfairmongodb.Controller;


import com.example.jobfairmongodb.Model.Candidate;
import com.example.jobfairmongodb.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    // Get all candidates
    @GetMapping
    public ResponseEntity<List<Candidate>> getAllCandidates() {
        List<Candidate> candidates = candidateService.getAllCandidates();
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }

    // Get a candidate by ID
    @GetMapping("/{id}")
    public ResponseEntity<Candidate> getCandidateById(@PathVariable String id) {
        Optional<Candidate> candidate = candidateService.getCandidateById(id);
        return candidate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Save a new candidate
    @PostMapping
    public ResponseEntity<Candidate> saveCandidate(@RequestBody Candidate candidate) {
        Candidate savedCandidate = candidateService.saveCandidate(candidate);
        return new ResponseEntity<>(savedCandidate, HttpStatus.CREATED);
    }

    // Update a candidate
    @PutMapping("/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable String id, @RequestBody Candidate candidate) {
        if (!candidateService.getCandidateById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        candidate.setId(id);
        Candidate updatedCandidate = candidateService.updateCandidate(candidate);
        return new ResponseEntity<>(updatedCandidate, HttpStatus.OK);
    }

    // Delete a candidate by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable String id) {
        if (!candidateService.getCandidateById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        candidateService.deleteCandidate(id);
        return ResponseEntity.noContent().build();
    }
}
