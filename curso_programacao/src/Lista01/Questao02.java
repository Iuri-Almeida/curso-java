package Lista01;
import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		double raio, area;
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		raio = teclado.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("%nA área do círculo de raio %.2f é %.4f", raio, area);
		
		teclado.close();

	}

}
