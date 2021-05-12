package model.entities;

import model.exception.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance = 0.0;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		deposit(balance);
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws WithdrawException {
		
		if (amount > withdrawLimit) throw new WithdrawException("The amount exceeds withdraw limit!");
		
		if (amount > balance) throw new WithdrawException("Not enough balance");
		
		balance -= amount;
	}
	
}
