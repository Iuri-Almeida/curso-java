package Lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		n = teclado.nextInt();
		
		if (n >= 0) System.out.println("Não negativo");
		else System.out.println("Negativo");
		
		teclado.close();

	}

}
