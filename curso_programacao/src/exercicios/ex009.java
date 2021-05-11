package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ex009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int N;
		double soma, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		N = teclado.nextInt();
		
		Product[] vetor = new Product[N];
		
		soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("\nInforme o nome do %do produto: ", i + 1);
			teclado.nextLine();
			String nome = teclado.nextLine();
			
			System.out.printf("Informe o preco desse produto: ");
			double preco = teclado.nextDouble();
			
			vetor[i] = new Product(nome, preco);
			
			soma += vetor[i].getPrice();
			
		}
		
		media = soma / vetor.length;
		
		System.out.printf("\nA média de preco dos produtos informados é: %.2f", media);
		
		teclado.close();

	}

}
