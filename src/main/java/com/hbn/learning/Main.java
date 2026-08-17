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
		
		Employee emp = new Employee("Muskan", "Female", 72000);
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.persist(emp);
		transaction.commit();
		
		
		
		
		
		
		
		
		
		
		
		
//		Query query = session.createQuery("from employee", Employee.class);
//		List list = query.list();
//		System.out.println(list);
		
		
		
//		Query query = session.createQuery("from employee", Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		List list = query.list();
//		System.out.println(list);
		
//		Query query = session.createQuery("update employee set name = :n, salary = :s where is = :i", Employee.class);
//		
//		query.setParameter("n", "Afzal");
//		query.setParameter("s", "154321");
//		query.setParameter("i", "2");
//		query.executeUpdate();
		
		
//		MutationQuery query = session.createMutationQuery("delete from employee where id = :i");
//		query.setParameter("i", "6");
//		query.executeUpdate();
//		transaction.commit();
		
		
//	Query query1 = session.createQuery("SELECT max(name) from employee");
//		List list = query1.list();
//		System.out.println(query1.list());


		
	}

}
