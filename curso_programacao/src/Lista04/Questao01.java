package Lista04;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro entre 1 e 1000: ");
		x = teclado.nextInt();
		
		for (int i = 1; i <= x; i += 2) {
			
			System.out.println(i);
			
		}
		
		teclado.close();

	}

}
