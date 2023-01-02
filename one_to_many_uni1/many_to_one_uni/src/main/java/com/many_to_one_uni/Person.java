package com.many_to_one_uni;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int id;
private String name;
private String email;
private long Cno;
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
	return Cno;
}
public void setCno(long cno) {
	Cno = cno;
}
	
	

}

