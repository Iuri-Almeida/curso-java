package exercicios;

import java.io.File;
import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a directory path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] directories = path.listFiles(File::isDirectory);
		
		System.out.println("\nDirectories:");
		
		for (File d : directories) System.out.println(d);
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("\nFiles:");
		
		for (File f : files) System.out.println(f);
		
		boolean isSuccess = new File(strPath + "/subdir").mkdir();
		
		System.out.println("\nDirectory created successfully: " + isSuccess);
		
		sc.close();

	}

}
