package Lista04;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		int N;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de linhas que deseja: ");
		N = teclado.nextInt();
		
		for (int i = 1; i <= N; i++) System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
		
		teclado.close();

	}

}
