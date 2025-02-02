package com.example.jobfairmongodb.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "college_students")
public class CollegeStudent {
    @Id
    private String id;
    private String collegeName;
    private String universityBoard;
    private String collegeLocation;
    private String fullName;
    private String gender;
    private String countryCode;
    private String mobileNo;
    private String alternateMobileNo;
    private String state;
    private String phoneNo;
    private String district;
    private String email;
    private String hometown;
    private String dob;
    private String permanentAddress;
    private String pinCode;
    private String familyAnnualIncome;

    // Constructors
    public CollegeStudent() {}

    public CollegeStudent(String id, String collegeName, String universityBoard, String collegeLocation,
                          String fullName, String gender, String countryCode, String mobileNo,
                          String alternateMobileNo, String state, String phoneNo, String district,
                          String email, String hometown, String dob, String permanentAddress,
                          String pinCode, String familyAnnualIncome) {
        this.id = id;
        this.collegeName = collegeName;
        this.universityBoard = universityBoard;
        this.collegeLocation = collegeLocation;
        this.fullName = fullName;
        this.gender = gender;
        this.countryCode = countryCode;
        this.mobileNo = mobileNo;
        this.alternateMobileNo = alternateMobileNo;
        this.state = state;
        this.phoneNo = phoneNo;
        this.district = district;
        this.email = email;
        this.hometown = hometown;
        this.dob = dob;
        this.permanentAddress = permanentAddress;
        this.pinCode = pinCode;
        this.familyAnnualIncome = familyAnnualIncome;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public String getUniversityBoard() { return universityBoard; }
    public void setUniversityBoard(String universityBoard) { this.universityBoard = universityBoard; }
    public String getCollegeLocation() { return collegeLocation; }
    public void setCollegeLocation(String collegeLocation) { this.collegeLocation = collegeLocation; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public String getAlternateMobileNo() { return alternateMobileNo; }
    public void setAlternateMobileNo(String alternateMobileNo) { this.alternateMobileNo = alternateMobileNo; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getHometown() { return hometown; }
    public void setHometown(String hometown) { this.hometown = hometown; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getPermanentAddress() { return permanentAddress; }
    public void setPermanentAddress(String permanentAddress) { this.permanentAddress = permanentAddress; }
    public String getPinCode() { return pinCode; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }
    public String getFamilyAnnualIncome() { return familyAnnualIncome; }
    public void setFamilyAnnualIncome(String familyAnnualIncome) { this.familyAnnualIncome = familyAnnualIncome; }
}
