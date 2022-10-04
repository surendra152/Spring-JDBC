package com.sts.spring.jdbc.dao;

import java.util.List;

import com.sts.spring.jdbc.entities.Crud;

public interface CrudDao {
	
	public int insert(Crud crud);
	
	public int change(Crud crud);
	
	public int delete (int studentid);
	
	public Crud getCrud(int studentid);
	
	public List<Crud> getAllCrud();
	
}
