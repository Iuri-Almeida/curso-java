package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int N;
		double n1, n2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe quantos pares de números serão lidos: ");
		N = teclado.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("Digite os números: ");
			n1 = teclado.nextDouble();
			n2 = teclado.nextDouble();
			
			System.out.printf((n2 == 0) ? "Divisão Impossível\n" : "%.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
			
		}
		
		teclado.close();

	}

}
