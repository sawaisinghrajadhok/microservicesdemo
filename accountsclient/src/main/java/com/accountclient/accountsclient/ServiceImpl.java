package com.accountclient.accountsclient;
  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public List<Account> getAll() {
		return accountRepository.getAll();
	}

	@Override
	public Account get(String number) {
		return accountRepository.getAccount(number);
	}
}
