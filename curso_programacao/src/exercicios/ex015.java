package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex015 {

	public static void main(String[] args) {
		
		String path = "/home/iuri/vertigo/curso-java/curso_programacao/src/exercicios/ex014.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
