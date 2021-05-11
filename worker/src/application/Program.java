package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome do departamento: ");
		String departamento = teclado.nextLine();
		
		System.out.println("\nInforme os dados do trabalhador:");
		
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Level (JUNIOR, MID_LEVEL, SENIOR): ");
		String level = teclado.nextLine();
		
		System.out.print("Salário base: R$");
		double salarioBase = teclado.nextDouble();
		
		Worker trabalhador = new Worker(nome, WorkerLevel.valueOf(level), salarioBase, new Departament(departamento));
		
		System.out.print("Quantos contratos esse trabalhador tem? ");
		int N = teclado.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.printf("\nInforme os dados do contrato #%d:\n", i + 1);
			
			System.out.print("Data (DD/MM/YYYY): ");
			teclado.nextLine();
			Date data = sdf.parse(teclado.nextLine());
			
			System.out.print("Valor por hora: R$");
			double valorPorHora = teclado.nextDouble();
			
			System.out.print("Duracão (horas): ");
			int horas = teclado.nextInt();
			
			trabalhador.addContract(new HourContract(data, valorPorHora, horas));
			
		}
		
		System.out.print("\nInforme o mês e o ano para calcularmos quanto esse trabalhador recebeu (MM/YYYY): ");
		teclado.nextLine();
		
		Date data = sdf2.parse(teclado.nextLine());
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		
		int mes = 1 + calendario.get(Calendar.MONTH);
		int ano = calendario.get(Calendar.YEAR);
		
		double fatura = trabalhador.income(ano, mes);
		
		System.out.printf("\nNome: %s", trabalhador.getName());
		System.out.printf("\nDepartamento: %s", trabalhador.getDepartament());
		System.out.printf("\nFarutra para %d/%d: %.2f", mes, ano, fatura);
		
		
		teclado.close();

	}

}
