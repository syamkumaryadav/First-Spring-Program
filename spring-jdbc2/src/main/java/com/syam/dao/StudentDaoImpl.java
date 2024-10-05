package com.syam.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.syam.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private String INSERT="insert into std values (?,?,?)";
	
	private String DELETE="delete from std where stuid=?";
	
	private String UPDATE="update std set FIRSTNAME=?, LASTNAME=? where STUID=?";
	
	
	
	private String GET_ONE = "select * from std where stuid=?";
	private String GET_ALL = "select * from std";
	

	
	
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl() {}
	
	public StudentDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public void saveStudent(Student st) {
		jdbcTemplate.update(INSERT,st.getStuId(),st.getFirstName(),st.getLastName());
		
	}

	@Override
	public void deleteStudent(Integer stuId) {
		jdbcTemplate.update(DELETE,stuId);
		
	}

	@Override
	public void updateStudent(Student st) {
		jdbcTemplate.update(UPDATE,st.getFirstName(),st.getLastName(),st.getStuId());
		
	}

	
	@Override
	public Student getStudent(Integer stuId) {
		List<Student> students =  jdbcTemplate.query(GET_ONE,new Object[] {stuId}, new StudentRowMapper());
		return students.get(0);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students =  jdbcTemplate.query(GET_ALL, new StudentRowMapper());
		return students;
	}

	


}
