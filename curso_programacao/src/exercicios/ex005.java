package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ex005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		double areaX, areaY;
		char maiorArea;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe as medidas dos lados do triângulo X: ");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();

		System.out.print("Informe as medidas dos lados do triângulo Y: ");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		maiorArea = (areaX > areaY) ? 'X' : 'Y';
		
		System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
		System.out.printf("\nÁrea do triângulo Y: %.4f", areaY);
		System.out.printf("\nMaior área = %s", maiorArea);
		
		teclado.close();

	}

}
