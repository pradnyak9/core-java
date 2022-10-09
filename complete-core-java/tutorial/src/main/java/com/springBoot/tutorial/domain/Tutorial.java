package com.springBoot.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tutorials")
public class Tutorial {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "published")
	private boolean published;
	@Column(name = "publisher")
	private String publisher;
	
	public Tutorial() {
		
	}
	
	public Tutorial(String title, String description, boolean published, String publisher) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.description = description;
		this.published = published;
		this.publisher = publisher;
	}

}
