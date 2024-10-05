package com.syam.dao;

import com.syam.model.Student;

public interface StudentDao {
	
	public void saveStudent(Student st);
	
	public void deleteStudent(Integer stuId);
	
	public void updateStudent(Student st);

}
