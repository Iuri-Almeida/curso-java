package exercicios;

import java.io.File;
import java.util.Scanner;

public class ex018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		System.out.println("\ngetName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
