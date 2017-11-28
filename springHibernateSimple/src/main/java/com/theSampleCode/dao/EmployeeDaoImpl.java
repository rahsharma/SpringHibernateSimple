package com.theSampleCode.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.theSampleCode.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee e) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();

	}

	public List<Employee> list() {
		Session session = this.sessionFactory.openSession();
		List<Employee> empList = session.createQuery("from Employee").list();
		session.close();
		return empList;
	}

}
