package Lista03;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe as coordenadas:");
		System.out.print("X: ");
		x = teclado.nextDouble();
		System.out.print("Y: ");
		y = teclado.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) System.out.println("Primeiro");
			else if (x < 0 && y > 0) System.out.println("Segundo");
			else if (x < 0 && y < 0) System.out.println("Terceiro");
			else System.out.println("Quarto");
			
			System.out.println("Informe as novas coordenadas:");
			System.out.print("X: ");
			x = teclado.nextDouble();
			System.out.print("Y: ");
			y = teclado.nextDouble();
			
		}
		
		teclado.close();

	}

}
