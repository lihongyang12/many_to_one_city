package com.lhy.entity;

public class City {
	
	private Integer sid;
	private String sname;
	private Integer id;
	
	private Sheng sheng;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Integer sid, String sname, Integer id, Sheng sheng) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.id = id;
		this.sheng = sheng;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sheng getSheng() {
		return sheng;
	}

	public void setSheng(Sheng sheng) {
		this.sheng = sheng;
	}

	@Override
	public String toString() {
		return "City [sid=" + sid + ", sname=" + sname + ", id=" + id + ", sheng=" + sheng + "]";
	}
	
	
}
