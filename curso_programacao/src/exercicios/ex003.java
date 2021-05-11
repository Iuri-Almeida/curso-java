package exercicios;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		int n;
		String dia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		n = teclado.nextInt();
		
		switch (n) {
			
			case 1:
				dia = "Domingo";
				break;
			
			case 2:
				dia = "Segunda";
				break;
				
			case 3:
				dia = "Terça";
				break;
			
			case 4:
				dia = "Quarta";
				break;
			
			case 5:
				dia = "Quinta";
				break;
			
			case 6:
				dia = "Sexta";
				break;
				
			case 7:
				dia = "Sábado";
				break;
			
			default:
				dia = "Valor Inválido";
				break;

		}
		
		System.out.printf("%nDia da semana: %s", dia);
		
		teclado.close();

	}

}
