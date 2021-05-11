package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner teclado = new Scanner(System.in);
		
		/* ----------------------- CLIENT -------------------------- */
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = teclado.nextLine();
		
		System.out.print("E-mail: ");
		String email = teclado.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(teclado.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		/* --------------------------------------------------------- */
		
		System.out.println("\nEnter order data:");
		
		System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
		String status = teclado.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("\nHow many items to this order? ");
		int n = teclado.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("\nEnter #%d item data:\n", i + 1);
			
			System.out.print("Product name: ");
			teclado.nextLine();
			String productName = teclado.nextLine();
			
			System.out.print("Product price: R$");
			double productPrice = teclado.nextDouble();
			
			System.out.print("Quantity: ");
			int productQuantity = teclado.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(item);
			
		}
		
		System.out.println();
		
		System.out.println(order);
		
		teclado.close();

	}

}
