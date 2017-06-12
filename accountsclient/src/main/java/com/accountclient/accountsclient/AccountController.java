package com.accountclient.accountsclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	private Service service;
	
	@RequestMapping(value ="/accountList")
	public List<Account> getAll() {
		return service.getAll();
	}
	
	/*@RequestMapping(value = "/accountDetails/{number}", method = RequestMethod.GET)
	public Account create(@PathVariable("number") String number) {
		return service.get(number);
	}*/
	
}
