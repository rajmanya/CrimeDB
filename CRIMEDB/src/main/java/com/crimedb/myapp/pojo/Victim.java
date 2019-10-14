package com.crimedb.myapp.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="victim")
public class Victim {
@Id
@Column(name="victim_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int victim_id;
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
@PrimaryKeyJoinColumn
private Crime_record crime_record;


public Victim() {
	
}





public int getVictim_id() {
	return victim_id;
}





public void setVictim_id(int victim_id) {
	this.victim_id = victim_id;
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


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
