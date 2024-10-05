package com.syam.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.syam.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private String INSERT="insert into std values (?,?,?)";
	
	private String DELETE="delete from std where stuid=?";
	
	private String UPDATE="update std set FIRSTNAME=?, LASTNAME=? where STUID=?";
	
	
	
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

}
