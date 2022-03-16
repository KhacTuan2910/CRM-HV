package com.cybersoft.java14.crm.entity;

import java.util.Date;

public class Project {
	/* properties */
	private int 	id;
	private String 	name;
	private String 	description;
	private Date 	startDate;
	private Date 	endDate;
	private int 	createUser;
	/* constructor */
	public Project() {
		this.id 			= 0;
		this.name 			= "";
		this.description 	= "";
		this.startDate 		= null;
		this.endDate 		= null;
		this.createUser 	= 0;
	}
	
	public Project(int id, String name, String description, Date startDate, Date endDate, int createUser) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createUser = createUser;
	}
	
	/* getters/setters */
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}	
	
	/* methods */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Project project = null;
		
		try {
			project = (Project) obj;
		} catch (Exception e) {
			return false;
		}
		
		if (this.name.equalsIgnoreCase(project.getName())) {
			return true;
		}
		
		return false;
	}
}
