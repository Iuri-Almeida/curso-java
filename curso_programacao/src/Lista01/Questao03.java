package Lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A = teclado.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = teclado.nextInt();
		
		System.out.print("Digite o valor de C: ");
		C = teclado.nextInt();
		
		System.out.print("Digite o valor de D: ");
		D = teclado.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.printf("%nO resultado final é: %d", diferenca);
		
		teclado.close();
		
	}

}
