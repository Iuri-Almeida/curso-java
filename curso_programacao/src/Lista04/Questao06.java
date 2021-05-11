package Lista04;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		int N;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		N = teclado.nextInt();
		
		for (int i = 1; i <= N; i++) if ((N % i) == 0) System.out.println(i);
		
		teclado.close();

	}

}
