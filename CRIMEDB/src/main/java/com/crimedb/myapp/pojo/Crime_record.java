package com.crimedb.myapp.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Crime_record {
@Id
@Column(name="crime_record_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int crime_record_id;
@Column(name="date_of_offence")
private Date date_of_offence;
@Column(name="Case_Status")
private String Case_status;

@Column(name="Crime_type")
private String Crime;


@Column(name="location")
private String location;


@Column(name="police_officer")
private String police_officer;



public Crime_record() {
	
}

public int getCrime_record_id() {
	return crime_record_id;
}

public void setCrime_record_id(int crime_record_id) {
	this.crime_record_id = crime_record_id;
}

public Date getDate_of_offence() {
	return date_of_offence;
}

public void setDate_of_offence(Date date_of_offence) {
	this.date_of_offence = date_of_offence;
}

public String getCase_status() {
	return Case_status;
}

public void setCase_status(String case_status) {
	Case_status = case_status;
}

public String getCrime() {
	return Crime;
}

public void setCrime(String crime) {
	Crime = crime;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getPolice_officer() {
	return police_officer;
}

public void setPolice_officer(String police_officer) {
	this.police_officer = police_officer;
}




}
