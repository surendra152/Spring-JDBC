package com.sts.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sts.spring.jdbc.entities.Crud;

@Component("CrudDao")
public class CrudDaoImpl implements CrudDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	public int insert(Crud crud) {
		
		//insert query
        String query="insert into crud_spring(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,crud.getId(),crud.getName(),crud.getCity());
		return r;
	}
	
	public int change(Crud crud) {
		// updating data
		
		String query= "update crud_spring set city=? where id=?";
		int r = this.jdbcTemplate.update(query,crud.getCity(),crud.getId());
		
		return r;
	}
	
	
	public int delete(int studentid) {
		// delte operation
		String query="delete from crud_spring where id=?";
		int r = this.jdbcTemplate.update(query,studentid);
		return r;
	}
	
	
	public Crud getCrud(int studentid) {
		// selecting single stuent data //rowmapper is a interface
		String query="select * from crud_spring where id=?";
		RowMapper<Crud> rowMapper = new RowMapperImpl();
		Crud crud = this.jdbcTemplate.queryForObject(query, rowMapper,studentid);
		return crud;
		
	}
	
	
	public List<Crud> getAllCrud() {
		// selecting multiple students
		String query="select * from crud_spring";
		List<Crud> cruds = this.jdbcTemplate.query(query, new RowMapperImpl());
		return cruds;
	}
	
	

	

	

		
	
}
