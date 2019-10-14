package com.crimedb.myapp.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Accused {
@Id
@Column(name="accused_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int accused_id;
@Column(name="name")
private String name;
@Column(name="Age")
private String age;
@Column(name="Phone number")
private String phone_number;
@Column(name="Gender")
private String Gender;
@Column(name="Address")
private String Address;
@OneToOne
@JoinColumn(name="crime_record_id")
private Crime_record crime_record;


public Accused() {
	
}
public int getAccused_id() {
	return accused_id;
}
public void setAccused_id(int accused_id) {
	this.accused_id = accused_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Crime_record getCrime_record() {
	return crime_record;
}
public void setCrime_record(Crime_record crime_record) {
	this.crime_record = crime_record;
}
}
