package Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x, y;
		String resp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe as coordenadas: ");
		x = teclado.nextDouble();
		y = teclado.nextDouble();
		
		if (x == 0 && y == 0) resp = "Origem";
		else if (x == 0 && y != 0) resp = "Eixo Y";
		else if (x != 0 && y == 0) resp = "Eixo X";
		else if (x > 0 && y > 0) resp = "Q1";
		else if (x < 0 && y > 0) resp = "Q2";
		else if (x < 0 && y < 0) resp = "Q3";
		else resp = "Q4";
		
		System.out.printf("%n%s", resp
				);
		
		teclado.close();

	}

}
