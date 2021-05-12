package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.print("Informe o nome de várias pessoas: ");
			String[] vect = teclado.nextLine().split(" ");
			
			System.out.print("Informe uma posicão: ");
			int position = teclado.nextInt();
			
			System.out.printf("\nA pessoa digitada na posicao %d é o(a): %s\n", position, vect[position - 1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nPosicão inválida!");
		} catch (InputMismatchException e) {
			System.out.println("\nFalha na entrada dos dados!");
		}
		
		System.out.println("\nFim do programa!");
		
		teclado.close();

	}

}
