import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1, n2, n3, maior;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com 3 números inteiros: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		
		maior = max(n1, n2, n3);
		
		System.out.printf("\nMaior = %d", maior);
		
		teclado.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int maior;
		
		if (x > y && x > z) maior = x;
		else if (y > z) maior = y;
		else maior = z;
		
		return maior;
		
	}

}
