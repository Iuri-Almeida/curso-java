package Lista01;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("%n%d + %d = %d", num1, num2, soma);
		
		teclado.close();

	}

}
