package com.accountservice.accountservice;

import java.io.Serializable;

public class Account implements Serializable {
	
	private static final long serialVersionUID = 274088084514125207L;
	private Long amount;
	private String number;
	private String name;
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
