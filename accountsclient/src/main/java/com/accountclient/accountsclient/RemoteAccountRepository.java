package com.accountclient.accountsclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteAccountRepository implements AccountRepository {

	
	
	@Autowired
	protected RestTemplate restTemplate;

	protected String url;
	
	public RemoteAccountRepository(String url) {
		super();
		this.url = url.startsWith("http")? url : "http://" + url;
	}
	
	@Override
	public List<Account> getAll() {
		System.out.println("============================");
		Account[] accounts = restTemplate.getForObject(url + "/accounts", Account[].class); 
		return Arrays.asList(accounts);
	}

	@Override
	public Account getAccount(String number) {
		return restTemplate.getForObject(url, Account.class);
	}
}
