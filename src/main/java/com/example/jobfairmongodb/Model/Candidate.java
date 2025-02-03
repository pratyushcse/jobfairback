package com.example.jobfairmongodb.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "candidates")
public class Candidate {

    @Id
    private String id;
    private String collegeName;
    private String universityBoard;
    private String collegeLocation;

    private String fullName;
    private String gender;
    private String mobileNo;
    private String alternateMobileNo;
    private String state;
    private String district;
    private String email;
    private String hometown;
    private String dateOfBirth;
    private String permanentAddress;
    private String pinCode;
    private String familyIncome;

    private String sslcMode = "Regular"; // Default value
    private String sslcYearOfPassing;
    private String sslcMarks;

    private String pucCourse;
    private String pucSpecialization;
    private String pucMode = "Regular"; // Default value
    private String pucYearOfPassing;
    private String pucMarks;

    private String itiCourse;
    private String itiSpecialization;
    private String itiMode = "Regular"; // Default value
    private String itiYearOfPassing;
    private String itiMarks;

    private String diplomaCourse;
    private String diplomaMode = "Regular"; // Default value
    private String diplomaYearOfPassing;
    private String diplomaMarks;

    private String degreeCourse;
    private String degreestream;
    private String degreeSpecialization;
    private String degreeMode = "Regular"; // Default value
    private String degreeYearOfPassing;
    private String degreeMarks;

    private String postGradeCourse;
    private String postgradestream;
    private String postGradeSpecialization;
    private String postGradeMode = "Regular"; // Default value
    private String postGradeYearOfPassing;
    private String postGradeMarks;

    private List<String> otherTechnicalSkills;
    private List<String> otherLanguages;
    private List<String> otherIndustryAspiration;

    private String relocation;
    private String relocationDetails;
    private String higherStudies;
    private String experience;
    private String experienceyears;
    private String shiftWork;
    private String passport;
    private String drivingLicense;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getUniversityBoard() {
        return universityBoard;
    }

    public void setUniversityBoard(String universityBoard) {
        this.universityBoard = universityBoard;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }

    public void setCollegeLocation(String collegeLocation) {
        this.collegeLocation = collegeLocation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAlternateMobileNo() {
        return alternateMobileNo;
    }

    public void setAlternateMobileNo(String alternateMobileNo) {
        this.alternateMobileNo = alternateMobileNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
    }

    // Educational qualifications fields
    public String getSslcMode() {
        return sslcMode;
    }

    public void setSslcMode(String sslcMode) {
        this.sslcMode = sslcMode;
    }

    public String getSslcYearOfPassing() {
        return sslcYearOfPassing;
    }

    public void setSslcYearOfPassing(String sslcYearOfPassing) {
        this.sslcYearOfPassing = sslcYearOfPassing;
    }

    public String getSslcMarks() {
        return sslcMarks;
    }

    public void setSslcMarks(String sslcMarks) {
        this.sslcMarks = sslcMarks;
    }

    public String getPucCourse() {
        return pucCourse;
    }

    public void setPucCourse(String pucCourse) {
        this.pucCourse = pucCourse;
    }

    public String getPucSpecialization() {
        return pucSpecialization;
    }

    public void setPucSpecialization(String pucSpecialization) {
        this.pucSpecialization = pucSpecialization;
    }

    public String getPucMode() {
        return pucMode;
    }

    public void setPucMode(String pucMode) {
        this.pucMode = pucMode;
    }

    public String getPucYearOfPassing() {
        return pucYearOfPassing;
    }

    public void setPucYearOfPassing(String pucYearOfPassing) {
        this.pucYearOfPassing = pucYearOfPassing;
    }

    public String getPucMarks() {
        return pucMarks;
    }

    public void setPucMarks(String pucMarks) {
        this.pucMarks = pucMarks;
    }

    public String getItiCourse() {
        return itiCourse;
    }

    public void setItiCourse(String itiCourse) {
        this.itiCourse = itiCourse;
    }

    public String getItiSpecialization() {
        return itiSpecialization;
    }

    public void setItiSpecialization(String itiSpecialization) {
        this.itiSpecialization = itiSpecialization;
    }

    public String getItiMode() {
        return itiMode;
    }

    public void setItiMode(String itiMode) {
        this.itiMode = itiMode;
    }

    public String getItiYearOfPassing() {
        return itiYearOfPassing;
    }

    public void setItiYearOfPassing(String itiYearOfPassing) {
        this.itiYearOfPassing = itiYearOfPassing;
    }

    public String getItiMarks() {
        return itiMarks;
    }

    public void setItiMarks(String itiMarks) {
        this.itiMarks = itiMarks;
    }

    public String getDiplomaCourse() {
        return diplomaCourse;
    }

    public void setDiplomaCourse(String diplomaCourse) {
        this.diplomaCourse = diplomaCourse;
    }

    public String getDiplomaMode() {
        return diplomaMode;
    }

    public void setDiplomaMode(String diplomaMode) {
        this.diplomaMode = diplomaMode;
    }

    public String getDiplomaYearOfPassing() {
        return diplomaYearOfPassing;
    }

    public void setDiplomaYearOfPassing(String diplomaYearOfPassing) {
        this.diplomaYearOfPassing = diplomaYearOfPassing;
    }

    public String getDiplomaMarks() {
        return diplomaMarks;
    }

    public void setDiplomaMarks(String diplomaMarks) {
        this.diplomaMarks = diplomaMarks;
    }

    public String getDegreeCourse() {
        return degreeCourse;
    }

    public void setDegreeCourse(String degreeCourse) {
        this.degreeCourse = degreeCourse;
    }

    public String getDegreestream() {
        return degreestream;
    }

    public void setDegreestream(String degreestream) {
        this.degreestream = degreestream;
    }

    public String getDegreeSpecialization() {
        return degreeSpecialization;
    }

    public void setDegreeSpecialization(String degreeSpecialization) {
        this.degreeSpecialization = degreeSpecialization;
    }

    public String getDegreeMode() {
        return degreeMode;
    }

    public void setDegreeMode(String degreeMode) {
        this.degreeMode = degreeMode;
    }

    public String getDegreeYearOfPassing() {
        return degreeYearOfPassing;
    }

    public void setDegreeYearOfPassing(String degreeYearOfPassing) {
        this.degreeYearOfPassing = degreeYearOfPassing;
    }

    public String getDegreeMarks() {
        return degreeMarks;
    }

    public void setDegreeMarks(String degreeMarks) {
        this.degreeMarks = degreeMarks;
    }

    public String getPostGradeCourse() {
        return postGradeCourse;
    }

    public void setPostGradeCourse(String postGradeCourse) {
        this.postGradeCourse = postGradeCourse;
    }

    public String getPostgradestream() {
        return postgradestream;
    }

    public void setPostgradestream(String postgradestream) {
        this.postgradestream = postgradestream;
    }

    public String getPostGradeSpecialization() {
        return postGradeSpecialization;
    }

    public void setPostGradeSpecialization(String postGradeSpecialization) {
        this.postGradeSpecialization = postGradeSpecialization;
    }

    public String getPostGradeMode() {
        return postGradeMode;
    }

    public void setPostGradeMode(String postGradeMode) {
        this.postGradeMode = postGradeMode;
    }

    public String getPostGradeYearOfPassing() {
        return postGradeYearOfPassing;
    }

    public void setPostGradeYearOfPassing(String postGradeYearOfPassing) {
        this.postGradeYearOfPassing = postGradeYearOfPassing;
    }

    public String getPostGradeMarks() {
        return postGradeMarks;
    }

    public void setPostGradeMarks(String postGradeMarks) {
        this.postGradeMarks = postGradeMarks;
    }

    public List<String> getOtherTechnicalSkills() {
        return otherTechnicalSkills;
    }

    public void setOtherTechnicalSkills(List<String> otherTechnicalSkills) {
        this.otherTechnicalSkills = otherTechnicalSkills;
    }

    public List<String> getOtherLanguages() {
        return otherLanguages;
    }

    public void setOtherLanguages(List<String> otherLanguages) {
        this.otherLanguages = otherLanguages;
    }

    public List<String> getOtherIndustryAspiration() {
        return otherIndustryAspiration;
    }

    public void setOtherIndustryAspiration(List<String> otherIndustryAspiration) {
        this.otherIndustryAspiration = otherIndustryAspiration;
    }

    public String getRelocation() {
        return relocation;
    }

    public void setRelocation(String relocation) {
        this.relocation = relocation;
    }

    public String getRelocationDetails() {
        return relocationDetails;
    }

    public void setRelocationDetails(String relocationDetails) {
        this.relocationDetails = relocationDetails;
    }

    public String getHigherStudies() {
        return higherStudies;
    }

    public void setHigherStudies(String higherStudies) {
        this.higherStudies = higherStudies;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperienceyears() {
        return experienceyears;
    }

    public void setExperienceyears(String experienceyears) {
        this.experienceyears = experienceyears;
    }

    public String getShiftWork() {
        return shiftWork;
    }

    public void setShiftWork(String shiftWork) {
        this.shiftWork = shiftWork;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
