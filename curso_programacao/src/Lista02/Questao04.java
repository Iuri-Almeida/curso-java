package Lista02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal, duracao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite as horas inciais e finais do jogo: ");
		horaInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();
		
		if (horaFinal > horaInicial) duracao = horaFinal - horaInicial;
		else if (horaFinal < horaInicial) duracao = (24 - horaInicial) + horaFinal;
		else duracao = 24;
		
		System.out.printf("%nO jogo durou %d hora(s)", duracao);
		
		teclado.close();

	}

}
