package Lista03;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		int n, alcool, gasolina, diesel;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Opções:");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		
		System.out.print("Informe o tipo de conbustível abastecido: ");
		n = teclado.nextInt();
		
		alcool = gasolina = diesel = 0;
		
		while (n != 4) {
			
			if (n == 1) alcool += 1;
			else if (n == 2) gasolina += 1;
			else if (n == 3) diesel += 1;
			else System.out.println("Código inválido");
		
			System.out.println("\nOpções:");
			System.out.println("1. Álcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Fim");
			
			System.out.print("Informe o novo tipo de conbustível abastecido: ");
			n = teclado.nextInt();
			
		}
		
		System.out.println("\nMuito Obrigado!");
		System.out.printf("%nÁlcool: %d", alcool);
		System.out.printf("%nGasolina: %d", gasolina);
		System.out.printf("%nDiesel: %d", diesel);
		
		teclado.close();

	}

}
