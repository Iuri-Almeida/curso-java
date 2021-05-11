package ExerciciosDeFixacao;

import java.util.Scanner;

public class ex004 {
	
	public static void main(String[] args) {
		
		int m, n, x;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de linhas: ");
		m = teclado.nextInt();
		
		System.out.print("Informe o número de colunas: ");
		n = teclado.nextInt();
		
		System.out.println();
		
		int[][] matriz = new int[m][n];
		
		for (int l = 0; l < matriz.length; l++) {
			
			for (int c = 0; c < matriz[l].length; c++) {
				
				System.out.printf("Informe o valor da posicão [%d, %d]: ", l, c);
				matriz[l][c] = teclado.nextInt();
				
			}
			
		}
		
		System.out.println();
		drawMatriz(matriz);
		
		System.out.print("\nInforme um número inteiro: ");
		x = teclado.nextInt();
		
		for (int l = 0; l < matriz.length; l++) {
			
			for (int c = 0; c < matriz[l].length; c++) {
				
				if (matriz[l][c] == x) {
					
					System.out.printf("\nPosicão: [%d, %d]", l, c);
					
					if (c != 0) System.out.printf("\nLeft: %d", matriz[l][c - 1]);
					
					if (l != 0) System.out.printf("\nTop: %d", matriz[l - 1][c]);
					
					if (c != (matriz[l].length - 1)) System.out.printf("\nRight: %d", matriz[l][c + 1]);
					
					if (l != (matriz.length - 1)) System.out.printf("\nBotom: %d", matriz[l + 1][c]);
					
					System.out.println();
					
				}
				
			}
			
		}
		
		teclado.close();
		
	}
	
	public static void drawMatriz(int[][] matriz) {
		
		for (int l = 0; l < matriz.length; l++) {
			
			for (int c = 0; c < matriz[l].length; c++) {
				
				System.out.printf("%d ", matriz[l][c]);
				
			}
			
			System.out.print("\n");
			
		}
		
	}

}
