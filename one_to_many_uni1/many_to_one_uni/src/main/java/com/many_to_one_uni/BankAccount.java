package com.many_to_one_uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BankAccount {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String bank_name;
private long acc_no;
private String ifsc;

@ManyToOne
private Person person;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBank_name() {
	return bank_name;
}

public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}

public long getAcc_no() {
	return acc_no;
}

public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}

public String getIfsc() {
	return ifsc;
}

public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

}