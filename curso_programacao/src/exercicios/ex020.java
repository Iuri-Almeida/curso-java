package exercicios;

public class ex020 {

	public static void main(String[] args) {
		
		String a = "Teste";
		String b = "Teste";
		
		String c = new String("Teste");
		String d = new String("Teste");
		
		System.out.println("Hash Code A: " + a.hashCode());
		System.out.println("Hash Code B: " + b.hashCode());
		System.out.println("Hash Code C: " + c.hashCode());
		System.out.println("Hash Code D: " + d.hashCode());
		
		System.out.println("a.equals(b): " + a.equals(b));
		System.out.println("a.equals(c): " + a.equals(c));
		System.out.println("c.equals(d): " + c.equals(d));
		
		System.out.println("a == b: " + (a == b));
		System.out.println("a == c: " + (a == c));
		System.out.println("c == d: " + (c == d));

	}

}
