package ExerciciosDeFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ex003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int N;

		List<Employees> funcionarios = new ArrayList<Employees>();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o número de funcionários para serem registrados: ");
		N = teclado.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.printf("\nFuncionário #%d:\n", i + 1);

			System.out.print("Informe o ID do funcionário: ");
			int id = teclado.nextInt();

			while (hasId(funcionarios, id)) {
				
				System.out.printf("O id %d já existe, por favor informar outro: ", id);
				id = teclado.nextInt();

			}
			
			System.out.print("Informe o nome do funcionário: ");
			teclado.nextLine();
			String nome = teclado.nextLine();

			System.out.print("Informe o salário do funcionário: ");
			double salario = teclado.nextDouble();

			funcionarios.add(new Employees(id, nome, salario));

		}
		
		System.out.print("\nInforme o ID do funcionário que terá aumento no salário: ");
		int id = teclado.nextInt();
		
		if (hasId(funcionarios, id)) {
			
			System.out.print("Informe a porcentagem do aumento: ");
			double p = teclado.nextDouble();
			
			for (Employees f : funcionarios) if (f.getId() == id) f.increaseSalary(p);
			
		} else System.out.println("Esse ID não existe!");
		
		System.out.println("\nLista de funcionários:");
		
		for (Employees f : funcionarios) System.out.println(f);

		teclado.close();

	}
	
	public static boolean hasId(List<Employees> list, int id) {
		
		Employees verificaId = list.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
		
		return verificaId != null;
		
	}

}
