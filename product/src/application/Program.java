package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = teclado.nextInt();
		
		List<Product> products = new ArrayList<Product>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("\nProduct #%d data:\n", i + 1);
			
			System.out.print("Common, used or imported? (c/u/i) ");
			char commonOrUsedOrImported = teclado.next().charAt(0);
			
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			
			System.out.print("Price: R$");
			double price = teclado.nextDouble();
			
			Product product;
			
			if (commonOrUsedOrImported == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				teclado.nextLine();
				Date manufactureDate = sdf.parse(teclado.nextLine());
				
				product = new UsedProduct(name, price, manufactureDate);
				
			} else if (commonOrUsedOrImported == 'i') {
				
				System.out.print("Customs fee: R$");
				double customsFee = teclado.nextDouble();
				
				product = new ImportedProduct(name, price, customsFee);
				
			} else product = new Product(name, price);
			
			products.add(product);
			
		}
		
		System.out.println("\nPRICE TAGS:");
		
		for (Product p : products) System.out.println(p.priceTag());
		
		teclado.close();

	}

}
