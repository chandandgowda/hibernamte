package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPP {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 4);
		System.out.println(".......person info.........");
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getGender());

		Pan pan = person.getP();
		if (pan != null) {
			System.out.println(".....pan info......");
			System.out.println(pan.getId());
			System.out.println(pan.getName());
			System.out.println(pan.getType());
		}

	}
}
