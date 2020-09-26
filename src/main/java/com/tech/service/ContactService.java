package com.tech.service;

import java.util.List;

import com.tech.entity.ContactDtls;
import com.tech.entity.ContactDtls01;

public interface ContactService {
	
	public void saveAllContact(List<ContactDtls> entity);
	public void saveAllContactS(List<ContactDtls01> entity);

}
