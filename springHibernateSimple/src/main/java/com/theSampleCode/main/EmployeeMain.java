package com.theSampleCode.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.theSampleCode.dao.EmployeeDao;
import com.theSampleCode.model.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springHibernate.xml");
		EmployeeDao empDao = ctx.getBean(EmployeeDao.class);
		Employee emp = new Employee();
		emp.setName("Rahul");
		emp.setDepartment("Telecom");
		empDao.save(emp);
		for (Employee e : empDao.list()) {
			System.out.println(e);
		}
		ctx.close();
	}
}
