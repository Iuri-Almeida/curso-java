package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double largura, comprimento, area, metroQuadrado, preco;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a largura: ");
		largura = teclado.nextDouble();
		
		System.out.print("Digite o comprimento: ");
		comprimento = teclado.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		metroQuadrado = teclado.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("%nÁrea = %.2f", area);
		System.out.printf("%nPreço = %.2f", preco);
		
		teclado.close();

	}

}
