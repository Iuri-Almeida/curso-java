package Lista05;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Questao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);;
		
		Employee funcionario;
		
		funcionario = new Employee();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome: ");
		funcionario.name = teclado.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.grossSalary = teclado.nextDouble();
		System.out.print("Imposto: ");
		funcionario.tax = teclado.nextDouble();
		
		System.out.printf("\nFuncionário %s, $ %.2f", funcionario.name, funcionario.netSalary());
		
		System.out.print("\nQual a porcentagem para aumentar o salário? ");
		funcionario.increaseSalary(teclado.nextDouble());
		
		System.out.printf("\nDados atualizados: %s, $ %.2f", funcionario.name, funcionario.netSalary());
		
		teclado.close();
		
	}

}
