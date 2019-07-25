package com.lhy.entity;

public class Sheng {
	
	private Integer id;
	private String name;
	public Sheng(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Sheng() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sheng [id=" + id + ", name=" + name + "]";
	}
	
	
}
