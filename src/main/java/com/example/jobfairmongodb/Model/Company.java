package com.example.jobfairmongodb.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companies")
public class Company {
    @Id
    private String id;
    private String companyName;
    private String contactPerson;
    private String email;
    private String phone;
    private String industryType;
    private String companyWebsite;
    private String jobRoles;
    private String companyAddress;
    private String jobLocation;
    private String fromCTC;
    private String toCTC;
    private String fromExperience;
    private String toExperience;
    private String designation;
    private String qualification;
    private String course;
    private String stream;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getJobRoles() {
        return jobRoles;
    }

    public void setJobRoles(String jobRoles) {
        this.jobRoles = jobRoles;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getFromCTC() {
        return fromCTC;
    }

    public void setFromCTC(String fromCTC) {
        this.fromCTC = fromCTC;
    }

    public String getToCTC() {
        return toCTC;
    }

    public void setToCTC(String toCTC) {
        this.toCTC = toCTC;
    }

    public String getFromExperience() {
        return fromExperience;
    }

    public void setFromExperience(String fromExperience) {
        this.fromExperience = fromExperience;
    }

    public String getToExperience() {
        return toExperience;
    }

    public void setToExperience(String toExperience) {
        this.toExperience = toExperience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
