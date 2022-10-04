package com.sts.spring.jdbc.SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sts.spring.jdbc.dao.CrudDao;
import com.sts.spring.jdbc.dao.CrudDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.sts.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("surendra");
		
		return ds;
		
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbctem=new JdbcTemplate();
		jdbctem.setDataSource(getDataSource());
		return jdbctem;
	}
	
	/*
	 *i am suing autowiring so it will take this class automatically
	 
	@Bean(name="CrudDao")
	public CrudDao getCrudDao()
	{
		CrudDaoImpl crudDao=new CrudDaoImpl();
		crudDao.setJdbcTemplate(getTemplate());
		return crudDao;
		
	}
	*/
}
