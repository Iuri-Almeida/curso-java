package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		numFuncionario = teclado.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextInt();
		
		System.out.print("Digite o salário (por hora): ");
		valorPorHora = teclado.nextDouble();
		
		salario = valorPorHora * horasTrabalhadas;
		
		System.out.printf("%nFuncionário: %d", numFuncionario);
		System.out.printf("%nSalário: U$ %.2f", salario);
		
		teclado.close();

	}

}
