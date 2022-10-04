package com.sts.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sts.spring.jdbc.entities.Crud;

public class RowMapperImpl implements RowMapper<Crud>{

	public Crud mapRow(ResultSet rs, int rowNum) throws SQLException {


		Crud crud=new Crud();
		crud.setId(rs.getInt(1));
		crud.setName(rs.getString(2));
		crud.setCity(rs.getString(3));
		
		return crud;
	}

}
