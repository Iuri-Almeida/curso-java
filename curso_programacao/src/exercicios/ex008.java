package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int N;
		double soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		N = teclado.nextInt();
		
		double[] vetor = new double[N];
		
		soma = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Digite o %do valor: ", i + 1);
			vetor[i] = teclado.nextDouble();
			soma += vetor[i];
		}
		
		System.out.printf("A média das alturas é: %.2f", soma / N);
		
		teclado.close();

	}

}
