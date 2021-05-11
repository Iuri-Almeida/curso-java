package Lista04;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		int N, fatorial;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		N = teclado.nextInt();
		
		fatorial = 1;
		
		if (N != 0) for (int i = N; i > 0; i--) fatorial *= i;
		
		System.out.printf("\nO fatorial de %d é: %d", N, fatorial);
		
		teclado.close();

	}

}
