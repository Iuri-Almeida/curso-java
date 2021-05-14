package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Amount: R$");
			double amount = sc.nextDouble();
			
			System.out.print("Months: ");
			int months = sc.nextInt();
			
			InterestService is = new BrazilInterestService(2.0);
			
			System.out.printf("Payment after %d months = R$ %.2f", months, is.payment(amount, months));
			
		} catch (InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
