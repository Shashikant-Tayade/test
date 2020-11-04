package com.hefshine.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Employee;

public class Testing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) con.getBean("e");
		
		emp.work();
		
	}
	
	
	
	
}
