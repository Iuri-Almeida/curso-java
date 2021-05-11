package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ex007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double real, dolar;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual a atual cotacão do dolar? R$");
		real = teclado.nextDouble();
		
		System.out.print("Quantos dolares serão comprados? U$");
		dolar = teclado.nextDouble();
		
		System.out.printf("Valor a ser pago R$ %.2f", CurrencyConverter.dolar2Real(real, dolar));
		
		teclado.close();

	}

}
