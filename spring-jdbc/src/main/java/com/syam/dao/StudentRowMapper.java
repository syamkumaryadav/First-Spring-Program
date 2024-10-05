package com.syam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.syam.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student(rowNum, null, null);
		st.setStuId(rs.getInt("stuid"));
		st.setFirstName(rs.getString("firstname"));
		st.setLastName(rs.getString("lastname"));
		return st;
		
	}

}
