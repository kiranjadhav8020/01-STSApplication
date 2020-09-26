package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor

public class ContactDtls{
	
	@Id
	@GeneratedValue
	private int id; //hibernate_sequence sequence name
	

	private String studentName;
	
	
	private Integer studentNumber;
	
	ContactDtls(){}
	
	

}
