package com.syam.dao;

import java.util.List;

import com.syam.model.Student;

public interface StudentDao {
	
	public void saveStudent(Student st);
	
	public void deleteStudent(Integer stuId);
	
	public void updateStudent(Student st);
	
	public Student getStudent(Integer stdId);
	
	public List<Student> getAllStudents();

}
