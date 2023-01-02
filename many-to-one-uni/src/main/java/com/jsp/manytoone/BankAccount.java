package com.jsp.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int id;
private String name;
private String ifsc;
private Long acc_no;


@ManyToOne
private List<Person>person;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getIfsc() {
	return ifsc;
}


public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}


public long getAcc_no() {
	return acc_no;
}


public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}


public List<Person> getPerson() {
	return person;
}


public void setPerson(List<Person> person) {
	this.person = person;
}
}
