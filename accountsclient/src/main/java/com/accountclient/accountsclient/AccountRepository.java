package com.accountclient.accountsclient;

import java.util.List;

public interface AccountRepository {
	
	public List<Account> getAll();
	
	public Account getAccount(String number);
}
