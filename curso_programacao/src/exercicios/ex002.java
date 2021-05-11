package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		int minutos;
		double total;
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de minutos usados: ");
		minutos = teclado.nextInt();
		
		total = 50;
		
		if (minutos > 100) total += (minutos - 100) * 2;
		
		System.out.printf("%nO valor total a ser pago é: R$%.2f", total);
		
		teclado.close();

	}

}
