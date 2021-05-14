package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String path = "/home/iuri/vertigo/curso-java/interface_comparable/nomes.txt";
		String pathCSV = "/home/iuri/vertigo/curso-java/interface_comparable/nomes.csv";
		
		List<Employee> employees = new ArrayList<Employee>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathCSV))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] employee = line.split(",");
				
				employees.add(new Employee(employee[0], Double.parseDouble(employee[1])));
				
				line = br.readLine();
			}
			
			Collections.sort(employees);
			
			for (Employee e : employees) System.out.println(e.getName() + " - R$ " + String.format("%.2f", e.getSalary()));
			
		} catch (IOException e) {
			System.out.println("error: " + e);
		}

	}

}
