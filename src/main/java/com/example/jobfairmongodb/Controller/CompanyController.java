package com.example.jobfairmongodb.Controller;


import com.example.jobfairmongodb.Model.Company;
import com.example.jobfairmongodb.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // Get all companies
    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    // Get company by ID
    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable String id) {
        return companyService.getCompanyById(id);
    }

    // Create a new company
    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    // Delete company by ID
    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable String id) {
        companyService.deleteCompany(id);
    }
}
