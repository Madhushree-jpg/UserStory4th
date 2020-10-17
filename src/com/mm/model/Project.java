package com.mm.model;

public class Project {

	int id;
	String title;
	String description;
	String domain;


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String title, String description, String domain) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.domain = domain;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	
}

