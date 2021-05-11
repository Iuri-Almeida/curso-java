package Lista02;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o código do produto e sua quantidade: ");
		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		
		if (codigo == 1) total = 4.00 * quantidade;
		else if (codigo == 2) total = 4.50 * quantidade;
		else if (codigo == 3) total = 5.00 * quantidade;
		else if (codigo == 4) total = 2.00 * quantidade;
		else total = 1.50 * quantidade;
		
		System.out.printf("%nO total da compra deu R$ %.2f", total);
		
		teclado.close();

	}

}
