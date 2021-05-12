package exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex016 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Ola, mundo", "Meu nome é Iuri.", "Tudo bem com vcs?"};
		
		String path = "/home/iuri/vertigo/curso-java/curso_programacao/src/exercicios/ex015.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				
				bw.write(line);
				bw.newLine();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
