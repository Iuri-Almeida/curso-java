package exercicios;

import java.util.HashSet;
import java.util.Set;

public class ex021 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Notebook");
		set.add("Tv");
		set.add("Tablet");
		
		set.removeIf(x -> x.length() < 3);
		
		for (String s : set) System.out.println(s);

	}

}
