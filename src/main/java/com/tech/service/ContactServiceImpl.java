package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.ContactDao;
import com.tech.entity.ContactDtls;
import com.tech.entity.ContactDtls01;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDao daoRepo;
	
	@Override
	public void saveAllContact(List<ContactDtls> entity) {
		
	/*	List<ContactDtls> dtls = daoRepo.saveAll(entity);
		
		dtls.forEach(contact->
			System.out.println(contact)
				);

		*/
	}

	@Override
	public void saveAllContactS(List<ContactDtls01> entity) {
		
		List<ContactDtls01> dtls = daoRepo.saveAll(entity);
		
		dtls.forEach(contact->
			System.out.println(contact)
				);

		
	}
}
