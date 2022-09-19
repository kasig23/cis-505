package com.java8;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Account class is used to perform deposit,withdraw and 
 * balance check operations of customer account. 
 * 
 * @author kasiv
 *
 */
public class Account {

	private double balance=200;

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance = amt + getBalance();
	}
	
	public void withdraw(double amt) {
		
		if(getBalance() >= amt)
		balance = getBalance() - amt ;
		System.out.println(balance);
	}
	
	public void displayMenu() {
		
		System.out.println("Account Menu");
		System.out.println("Enter <D/d> for deposit");
		System.out.println("Enter <W/w> for deposit");
		System.out.println("Enter <B/b> for deposit");
		System.out.println("Enter Option>: ");
	}
	
	public String getTransactionDate() {
		Format f = new SimpleDateFormat("MM-dd-yyyy");
		return f.format(new Date());
	}
}
