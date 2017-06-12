package com.accountservice.accountservice;
 
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements com.accountservice.accountservice.Service {

	private static List<Account> accounts = new ArrayList<Account>();
	
	static {
		Account account1 = new Account();
		account1.setName("a");
		account1.setAmount(1000L);
		account1.setNumber("4");
	
		Account account2 = new Account();
		account2.setName("a");
		account2.setAmount(1000L);
		account2.setNumber("4");
	
		Account account3 = new Account();
		account3.setName("a");
		account3.setAmount(1000L);
		account3.setNumber("4");
	
		Account account4 = new Account();
		account4.setName("a");
		account4.setAmount(1000L);
		account4.setNumber("4");
	
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
	}
	
	@Override
	public List<Account> getAll() {
		return accounts;
	}

	@Override
	public Account create(Account account) {
		accounts.add(account);
		return account;
	}
}
