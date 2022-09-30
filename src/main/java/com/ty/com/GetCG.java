package com.ty.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCG {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		GST gst=entityManager.find(GST.class, 1);
		System.out.println("..........gst info.........");
		System.out.println(gst.getId());
		System.out.println(gst.getNumber());
		System.out.println(gst.getStatus());
		
		Company company=gst.getCom();
		if(company!=null) {
			System.out.println("........company info........");
			System.out.println(company.getId());
			System.out.println(company.getName());
			System.out.println(company.getAddress());
			
			
		}
	}

}
