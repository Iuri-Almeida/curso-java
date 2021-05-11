package Lista05;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Questao03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		
		Student aluno;
		aluno = new Student();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		aluno.name = teclado.nextLine();
		System.out.print("Nota P1: ");
		aluno.grade1 = teclado.nextDouble();
		System.out.print("Nota P2: ");
		aluno.grade2 = teclado.nextDouble();
		System.out.print("Nota P3: ");
		aluno.grade3 = teclado.nextDouble();
		
		System.out.printf("\nNota final: %.2f", aluno.finalGrade());
		System.out.printf("\nSituação: %s", (aluno.isApproved()) ? "Aprovado" : "Reprovado");
		if (!(aluno.isApproved())) System.out.printf("\nFaltaram %.2f pontos", aluno.missingPoints());
		
		teclado.close();

	}

}
