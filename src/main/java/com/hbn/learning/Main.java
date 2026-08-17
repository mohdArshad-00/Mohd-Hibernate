package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.learning.entity.Address;
import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Address add1 = new Address("Barielly", "UP", 262201);

		Employee emp = new Employee();
		emp.setName("Arshad");
		emp.setGender("Male");
		emp.setSalary(52000);
		emp.setAddress(add1);
		
		
		add1.setEmployee(emp);
		

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(emp);
		session.persist(add1);
		transaction.commit();
		
		
	
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
	}

}
