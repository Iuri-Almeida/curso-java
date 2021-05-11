package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite os valores de A, B e C: ");
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		areaTri = (A * C) / 2;
		areaCirc = Math.PI * Math.pow(C, 2);
		areaTrap = (A + B) * C / 2;
		areaQuad = Math.pow(B, 2);
		areaRet = A * B;
		
		System.out.printf("%nTrinângulo: %.3f", areaTri);
		System.out.printf("%nCírculo: %.3f", areaCirc);
		System.out.printf("%nTrapézio: %.3f", areaTrap);
		System.out.printf("%nQuadrado: %.3f", areaQuad);
		System.out.printf("%nRetângulo: %.3f", areaRet);
		
		teclado.close();

	}

}
