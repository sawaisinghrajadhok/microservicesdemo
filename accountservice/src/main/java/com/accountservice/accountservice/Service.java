package com.accountservice.accountservice;

import java.util.List;


public interface Service {
	
	public List<Account> getAll();
	
	public Account create(Account account);
}
