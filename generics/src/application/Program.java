package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		PrintService<String> ps = new PrintService<String>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Enter the #%d value: ", i + 1);
			String value = sc.next();
			
			ps.addValue(value);
			
		}
		
		System.out.print("List: ");
		ps.print();
		
		try {
			String first = ps.first();
			System.out.println("\nFirst: " + first);
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
