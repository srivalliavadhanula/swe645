package com.dao.tables;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "StudentSurveyFormTable")
public class StudentSurveyFormTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id",nullable = false, unique = true)
	private int student_id;
	
	@Column(name = "LastName", nullable = false)
	private String lastName;
	
	@Column(name = "FirstName", nullable = false)
	private String firstName;
	
	@Column(name = "Address", nullable = false)
	private String address;
	
	@Column(name = "City", nullable = false)
	private String city;
	
	@Column(name = "State", nullable = false)
	private String state;	
	
	@Column(name = "Zip", nullable = false)
	private String zip;
	
	@Column(name = "Telephone", nullable = false)
	private String telephone;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "DateOfSurvey", nullable = false)
	private String dateOfSurvey;
	
	@Column(name = "MostLiked")
	private String mostLiked;
	
	@Column(name = "SourceOfInterest")
	private String sourceOfInterest;
	
	@Column(name = "Recommendation")
	private String recommendation;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfSurvey() {
		return dateOfSurvey;
	}

	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}

	public String getMostLiked() {
		return mostLiked;
	}

	public void setMostLiked(String mostLiked) {
		this.mostLiked = mostLiked;
	}

	public String getSourceOfInterest() {
		return sourceOfInterest;
	}

	public void setSourceOfInterest(String sourceOfInterest) {
		this.sourceOfInterest = sourceOfInterest;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	
}
