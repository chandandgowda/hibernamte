package com.ty.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GSTDriver {
	public static void main(String[] args) {
		
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager  entityManager=entityManagerFactory.createEntityManager();
     GST gst=new GST();
     gst.setNumber(123456);
     gst.setStatus("active");
     
     
     Company company=new Company();
     company.setName("TYSS");
     company.setAddress("kathriguppe");
     gst.setCom(company);
     EntityTransaction entityTransaction=entityManager.getTransaction();
     entityTransaction.begin();
     entityManager.persist(gst);
     entityManager.persist(company);
     entityTransaction.commit();
	}
}