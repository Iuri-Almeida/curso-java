package ExerciciosDeFixacao;

import java.util.Scanner;

import entities.Rooms;

public class ex002 {

	public static void main(String[] args) {
		
		Rooms[] quartos = new Rooms[10];
		
		int N;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número de estudantes que irão alugar os quartos: ");
		N = teclado.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.printf("\nReserva #%d:\n", i + 1);
			
			System.out.print("Informe seu nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			
			System.out.print("Informe seu e-mail: ");
			String email = teclado.nextLine();
			
			System.out.print("Informe o número do quarto que deseja alugar (0 a 9): ");
			int quarto = teclado.nextInt();
			
			while (quartos[quarto] != null) {
				
				System.out.printf("Desculpe, o quarto %d já foi alugado. Informe outro quarto que deseja alugar (0 a 9): ", quarto);
				quarto = teclado.nextInt();
				
			}
			
			quartos[quarto] = new Rooms(nome, email);
			
			System.out.printf("Quarto %d reservado!\n", quarto);
		}
		
		System.out.println("\nQuartos alugados:");
		
		for (int i = 0; i < quartos.length; i++) {
			
			if (quartos[i] != null) {
				
				System.out.printf("%d: %s\n", i, quartos[i]);
				
			}
			
		}
		
		teclado.close();

	}

}
