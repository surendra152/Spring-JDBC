package com.sts.spring.jdbc.entities;

public class Crud {

	private int id;
	private String name;
	private String city;


	public Crud() {

	}


	public Crud(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Crud [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	/* Database
	 * 
	 * CREATE TABLE crud_spring (
		id int,
		name varchar(100) not null,
		city varchar(100),
		PRIMARY KEY (id)
		);

		insert into crud_spring(id,name,city) values(200,'Surendra Bisoyi','Delhi');
	 *
	 */

}
