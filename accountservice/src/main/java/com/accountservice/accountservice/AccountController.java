package com.accountservice.accountservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private Service service;
	
	@RequestMapping(value ="/accounts")
	public List<Account> getAll() {
		System.out.println("resource called");
		return service.getAll();
	}
	
	/*@RequestMapping(value = "", method = RequestMethod.POST)
	public Account create(@RequestBody Account account) {
		return service.create(account);
	}*/
	
}
