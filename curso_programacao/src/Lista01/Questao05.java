package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int codigoPeca1, numPecas1, codigoPeca2, numPecas2;
		double valor1, valor2, valorTotal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o código, número e valor da peça 01: ");
		codigoPeca1 = teclado.nextInt();
		numPecas1 = teclado.nextInt();
		valor1 = teclado.nextDouble();
		
		System.out.print("Informe o código, número e valor da peça 02: ");
		codigoPeca2 = teclado.nextInt();
		numPecas2 = teclado.nextInt();
		valor2 = teclado.nextDouble();
		
		valorTotal = (numPecas1 * valor1) + (numPecas2 * valor2);
		
		System.out.printf("%nValor total a ser pago: R$ %.2f", valorTotal);
		
		teclado.close();

	}

}
