package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int N;
		double n1, n2, n3, mediaPond;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de testes a serem realizados: ");
		N = teclado.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("\nInforme os 3 valores dos testes: ");
			n1 = teclado.nextDouble();
			n2 = teclado.nextDouble();
			n3 = teclado.nextDouble();
			
			mediaPond = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
			
			System.out.printf("A média ponderada do teste é: %.1f\n", mediaPond);
			
		}
		
		teclado.close();

	}

}
