package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = teclado.nextInt();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("\nEmployee #%d data:\n", i + 1);
			
			System.out.print("Outsourced? (y/n) ");
			teclado.nextLine();
			boolean isOutsourced = (teclado.next().charAt(0) == 'y');
			
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			
			System.out.print("Hours: ");
			int hours = teclado.nextInt();
			
			System.out.print("Value per hour: R$");
			double valuePerHour = teclado.nextDouble();
			
			Employee employee;
			
			if (isOutsourced) {
				
				System.out.print("Additional charge: R$");
				double additionalCharge = teclado.nextDouble();
				
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
			} else employee = new Employee(name, hours, valuePerHour);
			
			employees.add(employee);
			
		}
		
		System.out.println("\nPAYMENTS:");
		
		for (Employee e : employees) System.out.println(e);
		
		teclado.close();

	}

}
