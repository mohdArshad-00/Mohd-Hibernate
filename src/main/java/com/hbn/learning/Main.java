package com.hbn.learning;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Shadab", "Male", 72000);
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Query<Employee> query = session.createNamedQuery("Employee.findEmployeeById", Employee.class);
		query.setParameter("id", "5");
		List<Employee> employees = query.getResultList();
		System.out.println(employees);

		System.out.println();

		Query<Employee> q = session.createNamedQuery("Employee.findByGender", Employee.class);
		q.setParameter("gender", "male");
		System.out.println(q.list());
//		tx.commit();
		session.close();
		

		
	}

}
