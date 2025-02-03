package com.example.jobfairmongodb.Service;


import com.example.jobfairmongodb.Model.Company;
import com.example.jobfairmongodb.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    // Get all companies
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    // Get company by ID
    public Optional<Company> getCompanyById(String id) {
        return companyRepository.findById(id);
    }

    // Save company
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    // Delete company by ID
    public void deleteCompany(String id) {
        companyRepository.deleteById(id);
    }
}
