package com.accountclient.accountsclient;

import java.util.List;


public interface Service {
	
	public List<Account> getAll();
	
	public Account get(String number);
}
