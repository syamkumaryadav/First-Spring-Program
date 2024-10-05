package com.syam.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syam.dao.StudentDao;
import com.syam.model.Student;


public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentDao dao=ctx.getBean("dao",StudentDao.class);
	
	
	
	  Student st=new Student(2,"syam","kumar"); 
	  dao.saveStudent(st);
	  System.out.println("Inserted sucessfull....");
	 
	 
	
	/*
	 * dao.deleteStudent(11); System.out.println("Deleted.......");
	 */
	
	/*
	 * Student st=new Student(1,"syam","kumar"); dao.updateStudent(st);
	 * System.out.println("updated sucessfull....");
	 */
	}
	
}
