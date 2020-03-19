package com.moonlighttec.course;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.moonlighttec.topic.Topic;

@Entity // Jetzt erstellt JPA eine Tabelle namens Topic mit den folgenden Spalten: id,
		// name, description
public class Course {

	@Id // damit wurde der String id zum PK deklariert
	private String id; // primary key
	private String name;
	private String description;

	private Topic topic;
	
	//einfach nur zum pushen

	public Course() {

	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
