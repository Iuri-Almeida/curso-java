package Lista02;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		int A, B;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A e B: ");
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		if ((A % B) == 0 || (B % A) == 0) System.out.println("São múltiplos");
		else System.out.println("Não são múltiplos");
		
		teclado.close();

	}

}
