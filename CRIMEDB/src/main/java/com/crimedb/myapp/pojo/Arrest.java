package com.crimedb.myapp.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Arrest {
@Id
@Column(name="Arrest_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Arrest_id;
@OneToOne
@JoinColumn(name="crime_record_id")
private Crime_record crime_record;

private String cell_no;


public Arrest() {
	
}
public int getArrest_id() {
	return Arrest_id;
}
public void setArrest_id(int arrest_id) {
	Arrest_id = arrest_id;
}
public Crime_record getCrime_record() {
	return crime_record;
}
public void setCrime_record(Crime_record crime_record) {
	this.crime_record = crime_record;
}
public String getCell_no() {
	return cell_no;
}
public void setCell_no(String cell_no) {
	this.cell_no = cell_no;
}

}
