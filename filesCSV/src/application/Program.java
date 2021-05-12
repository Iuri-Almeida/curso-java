package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the .csv path: ");
		String readPath = sc.next();
		
		File path = new File(readPath);
		
		boolean isCreated = new File(path.getParent() + "/out").mkdir();
		
		if (!isCreated) System.out.println("The /out directory was not created!");
		
		String writePath = path.getParent() + "/out/summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(readPath))) {
			
			String line = br.readLine();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(writePath))) {
				
				while (line != null) {
					
					String[] words = line.split(",");
					
					double total = Double.parseDouble(words[1]) * Double.parseDouble(words[2]);
					
					bw.write(words[0] + "," + String.format("%.2f", total));
					bw.newLine();
					line = br.readLine();
					
				}
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
