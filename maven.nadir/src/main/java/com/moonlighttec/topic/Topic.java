package com.moonlighttec.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Jetzt erstellt JPA eine Tabelle namens Topic mit den folgenden Spalten: id, name, description
public class Topic {

	@Id // damit wurde der String id zum PK deklariert
	private String id; // primary key
	private String name;
	private String description;

	public Topic() {

	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

}
