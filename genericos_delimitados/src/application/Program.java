package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String path = "/home/iuri/vertigo/curso-java/genericos_delimitados/produtos.csv";
		
		List<Product> product = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				
				product.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			System.out.println("Most expensive: " + CalculationService.max(product));
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
