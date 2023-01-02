package com.many_to_one_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Komal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransction = entityManager.getTransaction();
	

	
	
	Person person = new Person();
	person.setName("Pranit");
	person.setEmail("pranit123@gmail.com");
	person.setCno(98765432);

	BankAccount bankAccount1 = new BankAccount();
	bankAccount1.setAcc_no(123456789l);
	bankAccount1.setIfsc("SBI123");
	bankAccount1.setBank_name("SBI");
	bankAccount1.setPerson(person);

	BankAccount bankAccount2 = new BankAccount();
	bankAccount2.setAcc_no(123456789l);
	bankAccount2.setIfsc("HDFC123");
	bankAccount2.setBank_name("HDFC");
	bankAccount2.setPerson(person);

	BankAccount bankAccount3 = new BankAccount();
	bankAccount3.setAcc_no(123456789l);
	bankAccount3.setIfsc("kotak123");
	bankAccount3.setBank_name("HDFC");
	bankAccount3.setPerson(person);

	

	entityTransction.begin();
	entityManager.persist(person);

	entityManager.persist(bankAccount1);
	entityManager.persist(bankAccount2);
	entityManager.persist(bankAccount3);
	entityTransction.commit();
	System.out.println("All good");
}



}

