package entities;

public class BankAccount {

	private int accountNumber;
	private String name;
	private double balance;
	
	private final double TAX = 5.00;
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public BankAccount(int accountNumber, String name, double firstDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(firstDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdrawal(double value) {
		balance -= (value + TAX);
	}
	
	public String toString() {
		return "Conta " + getAccountNumber() + ", Dono(a): " + getName() + ", Saldo: $ " + String.format("%.2f", getBalance());
	}

}
