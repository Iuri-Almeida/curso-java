package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data!");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: R$");
			double inicialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: R$");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, inicialBalance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: R$");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		
		} catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();

	}

}
