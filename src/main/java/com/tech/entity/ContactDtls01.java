package com.tech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor

public class ContactDtls01 {

	@Id
	@Column(name="ID")
	@GenericGenerator(name = "hibernate_sequence",
	
					strategy = "com.tech.generator.CustomGenerator")
	
	@GeneratedValue(
			generator="hibernate_sequence", 
					strategy=GenerationType.SEQUENCE
			)
	private String id;
	
	@Column(name="STUDENT_NAME")
	private String name;
	
	@Column(name="student_number")
	private Integer num;
	
	public ContactDtls01() {
		// TODO Auto-generated constructor stub
	}
}
