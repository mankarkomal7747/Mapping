package com.jsp.mobile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sim {
@Id
@GeneratedValue
private int id;
private String service;
private String serviceType;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public String getServiceType() {
	return serviceType;
}
public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}
}
