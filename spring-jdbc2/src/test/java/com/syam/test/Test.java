package com.syam.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syam.dao.StudentDao;
import com.syam.model.Student;


public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentDao dao=ctx.getBean("dao",StudentDao.class);
	
	  for(Student s : dao.getAllStudents()) System.out.println(s);
	 
	
	/*
	 * Student st=new Student(11,"aa","bb"); dao.saveStudent(st);
	 * System.out.println("Inserted sucessfull....");
	 */
	 
	
	/*
	 * dao.deleteStudent(11); System.out.println("Deleted.......");
	 */
	
	/*
	 * Student st=new Student(1,"aa","bb"); dao.updateStudent(st);
	 * System.out.println("updated sucessfull....");
	 */
	  
	/*
	 * for(Student s : dao.getAllStudents()) System.out.println(s);
	 */
			
		
	/*
	 * Student s1 = dao.getStudent(1); System.out.println(s1);
	 */

	}
	
}
