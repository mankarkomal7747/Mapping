package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String []args)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Komal");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransction=entityManager.getTransaction();

	
	Person p1=new Person();
	p1.setName("abc");
	p1.setEmail("krmankr123@gaml.com");
	
	
	Pan pan=new Pan();
	pan.setPannum(67548972);
	
	
	p1.setPan(pan);
	pan.setPerson(p1);
	
	entityTransction.begin();
	entityManager.persist(p1);
	entityManager.persist(pan);
	entityTransction.commit();
	
	System.out.println("all good");
	

	
	
}
}
