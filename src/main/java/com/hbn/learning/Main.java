package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Arhan", "male", 88000, "HCL" );
		
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		session.persist(emp);
//		transaction.commit();
//
	    Employee employee =	session.find(Employee.class, 3);
	    System.out.println(employee);
	    
//	    session.load(emp, 1);
//	    System.out.println(emp);

	} 

}
