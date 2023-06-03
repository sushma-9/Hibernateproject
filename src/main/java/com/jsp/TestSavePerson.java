package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestSavePerson {


		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Person person = new Person();
			
			person.setName("mani");
			person.setAge(36);
			person.setGender("male");
			person.setPhno(9845334798l);
			
			Person person2 = new Person();
			
			person2.setName("manish");
			person2.setAge(39);
			person2.setGender("male");
			person2.setPhno(98453376598l);
			
			Adharcard adharcard = new Adharcard();
			
			adharcard.setAdno(23483728788l);
			adharcard.setAddress("bangalore");
			
			Adharcard adharcard2 = new Adharcard();
			
			adharcard2.setAdno(234837937776l);
			adharcard2.setAddress("bangalore");
			
			person.setCard(adharcard);
			person2.setCard(adharcard2);
			
			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(person2);
			entityManager.persist(adharcard);
			entityManager.persist(adharcard2);
			entityTransaction.commit();
			

		}

	}

