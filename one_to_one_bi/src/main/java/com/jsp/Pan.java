package com.jsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long pannum;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public long getPannum() {
	return pannum;
}


public void setPannum(long pannum) {
	this.pannum = pannum;
}


public Person getPerson() {
	return person;
}


public void setPerson(Person person) {
	this.person = person;
}


@OneToOne
private Person person;
}
