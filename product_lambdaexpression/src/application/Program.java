package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				
				String productName = fields[0];
				double productPrice = Double.parseDouble(fields[1]);
				
				products.add(new Product(productName, productPrice));
				
				line = br.readLine();
				
			}
			
			double average = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / products.size();
			
			System.out.println("Average price: $ " + String.format("%.2f", average));
			
			List<String> productsBellowAverage = products.stream()
					.filter(p -> p.getPrice() < average)
					.sorted((p1, p2) -> -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()))
					.map(p -> p.getName())
					.collect(Collectors.toList());
			
			productsBellowAverage.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
