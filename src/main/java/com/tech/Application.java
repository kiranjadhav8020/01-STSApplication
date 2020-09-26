package com.tech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tech.entity.ContactDtls;
import com.tech.entity.ContactDtls01;
import com.tech.service.ContactService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactService service = context.getBean(ContactService.class);
		List<ContactDtls01> list=new ArrayList<ContactDtls01>();
		
		
		ContactDtls01 dtl1=new ContactDtls01("101","kiran",9847563);
		ContactDtls01 dtl2=new ContactDtls01("102","rohit",8948393);
		ContactDtls01 dtl3=new ContactDtls01("103","jayraj",79473628);
		
		/*
		ContactDtls01 dtl1=new ContactDtls01(101,"kiran",9847563);
		ContactDtls01 dtl2=new ContactDtls01(102,"rohit",8948393);
		ContactDtls01 dtl3=new ContactDtls01(103,"jayraj",79473628);
		*/
		list.add(dtl1);
		list.add(dtl2);
		list.add(dtl3);
		
		//new exprements
		
		service.saveAllContactS(list);
		
	}

}
