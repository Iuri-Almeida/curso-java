package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = teclado.nextInt();
		
		List<TaxPayer> people = new ArrayList<TaxPayer>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("\nTax payer #%d data:\n", i + 1);
			
			System.out.print("Individual or company? (i/c) ");
			char individualOrCompany = teclado.next().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			
			System.out.print("Anual income: R$");
			double anualIncome = teclado.nextDouble();
			
			TaxPayer person;
			
			if (individualOrCompany == 'i') {
				
				System.out.print("Health expenditures: R$");
				double healthSpending = teclado.nextDouble();
				
				person = new Individual(name, anualIncome, healthSpending);
				
			} else {
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = teclado.nextInt();
				
				person = new Company(name, anualIncome, numberOfEmployees);
				
			}
			
			people.add(person);
			
		}
		
		System.out.println("\nTAXES PAID:");
		
		double totalTaxes = 0;
		
		for (TaxPayer p : people) {
			
			System.out.printf(p.getName() + ": $ " + String.format("%.2f\n", p.taxPaid()));
			
			totalTaxes += p.taxPaid();
			
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f\n", totalTaxes);
		
		teclado.close();

	}

}
