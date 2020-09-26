package com.tech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.entity.ContactDtls;
import com.tech.entity.ContactDtls01;

public interface ContactDao extends JpaRepository<ContactDtls01,Integer>{

	

}
