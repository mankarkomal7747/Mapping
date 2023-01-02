package com.jsp.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private long cno;

@ManyToOne
private List<BankAccount>bank_accounts ;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getCno() {
	return cno;
}

public void setCno(long cno) {
	this.cno = cno;
}

public List<BankAccount> getBank_accounts() {
	return bank_accounts;
}

public void setBank_accounts(List<BankAccount> bank_accounts) {
	this.bank_accounts = bank_accounts;
}

}
