package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ex006 {

	public static void main(String[] args) {
		
		String name;
		double price;
		int quantity;
		
		Locale.setDefault(Locale.US);
		
		Product product;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto:");
		System.out.print("Nome: ");
		name = teclado.next();
		System.out.print("Preco: ");
		price = teclado.nextDouble();
		System.out.print("Quantidade em estoque: ");
		quantity = teclado.nextInt();
		
		product = new Product(name, price, quantity);
		
		System.out.print("Dados do produto: " + product.toString() + "\n");
		
		System.out.print("\nInforme o número de produtos a serem adicionados ao estoque: ");
		product.addProducts(teclado.nextInt());
		
		System.out.print("Dados atualizados: " + product + "\n");
		
		System.out.print("\nInforme o número de produtos a serem removidos do estoque: ");
		product.removeProducts(teclado.nextInt());
		
		System.out.print("Dados atualizados: " + product + "\n");
		
		teclado.close();

	}

}
