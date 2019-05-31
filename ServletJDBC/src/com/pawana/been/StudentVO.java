package com.pawana.been;

public class StudentVO {
	private Integer id;
	private String name;
	private Integer branch;
	public StudentVO() {
		
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
	public Integer getBranch() {
		return branch;
	}
	public StudentVO(Integer id, String name, Integer branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

}
