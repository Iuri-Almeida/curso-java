package ExerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ex001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BankAccount conta;
		
		int numeroDaConta;
		String nome;
		char resp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta: ");
		numeroDaConta = teclado.nextInt();
		
		System.out.print("Entre com o nome do dono: ");
		teclado.nextLine();
		nome = teclado.nextLine();
		
		System.out.print("Tem algum depósito inicial? (s/n) ");
		resp = teclado.next().toLowerCase().charAt(0);
		
		if (resp == 's') {
			System.out.print("Entre com o valor do primeiro depósito: R$");
			conta = new BankAccount(numeroDaConta, nome, teclado.nextDouble());
		} else conta = new BankAccount(numeroDaConta, nome);
		
		System.out.println("\nDados da conta:");
		System.out.println(conta);
		
		System.out.print("\nEntre com o valor de depósito: R$");
		conta.deposit(teclado.nextDouble());
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.print("\nEntre com o valor de saque: R$");
		conta.withdrawal(teclado.nextDouble());
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		teclado.close();

	}

}
