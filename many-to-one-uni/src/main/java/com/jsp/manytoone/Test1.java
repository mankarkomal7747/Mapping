package com.jsp.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Test1 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransction=entityManager.getTransaction();


	List<BankAccount>BAccount=new ArrayList();
	
	List<Person>p1=new ArrayList();
	
	
	BankAccount b1=new BankAccount();
	b1.setName("SBI1");
	b1.setAcc_no(1234);
	b1.setIfsc("sbi12");
	
	
	
	
	
	
	BAccount.add(b1);
	BAccount.add(b2);
	BAccount.add(b3);
	
	
	
	Person pp = new Person();
	pp.setName("komal");
	pp.setEmail("komal123@gmail.com");
	pp.setCno(98765432);
	
	
p1.add(pp);
	
	entityTransction.begin();
	entityManager.persist(b1);
	entityManager.persist(b2);
	entityManager.persist(b3);
	entityManager.persist(pp);
	entityTransction.commit();
	
	System.out.println("All Good");

	}
}
