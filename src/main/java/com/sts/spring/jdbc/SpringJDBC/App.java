package com.sts.spring.jdbc.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sts.spring.jdbc.dao.CrudDao;
import com.sts.spring.jdbc.entities.Crud;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started	......." );
        //sprig jdbc ==>jdbcTemplate
        
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
       
       CrudDao crudDao = context.getBean("CrudDao",CrudDao.class);
       /*
       //for insert
       Crud crud=new Crud();
       crud.setId(202);
       crud.setName("Nilesh");
       crud.setCity("Buguda");
       
       int result = crudDao.insert(crud);
       
       System.out.println("Student added:- "+result);
       */
       
       /*
       //for update
       Crud crud=new Crud();
       crud.setId(203);
       crud.setCity("India");
       
       int result = crudDao.change(crud);
       System.out.println("Data updated: "+result);
       
       */
       
       /*
       //delete operation
       int result = crudDao.delete(202);
       System.out.println("Row deleted:- "+result);
       
       */
       
       /*
        * 
       //selecting a single student
       Crud crud = crudDao.getCrud(203);
       System.out.println(crud);
       
       */
       
       
       //selecting multiple students
       List<Crud> allCrud = crudDao.getAllCrud();
       
       for(Crud c:allCrud)
       {
    	   System.out.println(c);
       }
       
       
    }
}
