package exercicios;

import java.util.Scanner;

public class ex010 {
	
	public static void main(String[] agrs) {
		
		int N, numNegativos;
		String diagonalPrincipal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da matriz: ");
		N = teclado.nextInt();
		
		int[][] matriz = new int[N][N];
		
		numNegativos = 0;
		diagonalPrincipal = "";
		
		for (int l = 0; l < matriz.length; l++) {
			
			for (int c = 0; c < matriz[l].length; c++) {
				
				System.out.printf("Informe o valor da posićão [%d, %d]: ", l + 1, c + 1);
				matriz[l][c] = teclado.nextInt();
				
				if (l == c) diagonalPrincipal += matriz[l][c] + " ";
				
				if (matriz[l][c] < 0) numNegativos += 1;
				
			}
			
		}
		
		System.out.printf("Diagonal principal: %s\n", diagonalPrincipal);
		System.out.printf("Números negativos: %d", numNegativos);
		
		teclado.close();
		
	}

}
