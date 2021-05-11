package Lista04;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		int N, x, somaIn, somaOut;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Infome a quantidade de valores a serem lidos: ");
		N = teclado.nextInt();
		
		somaIn = somaOut = 0;
		
		for (int i = 0; i < N; i++) {
			
			System.out.printf("Digite %do número: ", i + 1);
			x = teclado.nextInt();
			
			if (x >= 10 && x<= 20) somaIn++;
			else somaOut++;
			
		}
		
		System.out.printf("%n%d in", somaIn);
		System.out.printf("%n%d out", somaOut);
		
		teclado.close();

	}

}
