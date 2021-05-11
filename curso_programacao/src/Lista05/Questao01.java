package Lista05;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Questao01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Rectangle x;
		x = new Rectangle();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com os valores do retângulo: ");
		System.out.print("Largura: ");
		x.width = teclado.nextDouble();
		System.out.print("Altura: ");
		x.height = teclado.nextDouble();
		
		System.out.printf("\nÁrea = %.2f", x.area());
		System.out.printf("\nPerímetro = %.2f", x.perimeter());
		System.out.printf("\nDiagonal = %.2f", x.diagonal());
				
		teclado.close();

	}

}
