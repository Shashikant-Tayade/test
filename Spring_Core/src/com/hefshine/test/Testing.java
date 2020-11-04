package com.hefshine.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.util.Employee;

public class Testing {

	public static void main(String args[])
	{
		
	ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
	
	 Employee emp = (Employee) con.getBean("e");
		
	 emp.work();
	 
	}
}
