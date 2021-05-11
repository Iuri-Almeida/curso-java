package Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double renda, imposto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o salário: R$");
		renda = teclado.nextDouble();
		
		if (renda >= 0 && renda <= 2000) imposto = 0;
		else if (renda <= 3000) imposto = (renda - 2000) * 0.08;
		else if (renda <= 4500) imposto = (1000 * 0.08) + ((renda - 3000) * 0.18);
		else imposto = (1000 * 0.08) + (1500 * 0.18) + ((renda - 4500) * 0.28);
		
		if (imposto == 0) System.out.println("Isento");
		else System.out.printf("%nR$ %.2f", imposto);
		
		teclado.close();

	}

}
