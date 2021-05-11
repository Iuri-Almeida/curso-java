package Lista03;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual a sua senha? ");
		senha = teclado.nextInt();
		
		while (senha != 2002) {
			System.out.printf("Senha Inválida%n");
			System.out.printf("%nQual a sua senha? ");
			senha = teclado.nextInt();
		}
		
		System.out.printf("Acesso Permitido");
		
		teclado.close();

	}

}
