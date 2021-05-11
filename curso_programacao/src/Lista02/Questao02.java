package Lista02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		n = teclado.nextInt();
		
		if ((n % 2) == 0) System.out.println("Par");
		else System.out.println("Ímpar");
		
		teclado.close();
		
	}

}
