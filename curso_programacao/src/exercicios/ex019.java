package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex019 {

	public static void main(String[] args) {
		
		// get --> Ok / put --> Error
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(1);
		List<? extends Number> list = intList;
		Number x = list.get(0);
//		list.add(20); // erro de compilacão
		
		// get --> Error / put --> Ok
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Joao");
		myObjs.add("Pedro");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
//		Number x = myNums.get(0); // erro de compilacão
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> objs = new ArrayList<Object>();
		
		copy(myInts, objs);
		printList(objs);
		System.out.println();
		copy(myDoubles, objs);
		printList(objs);

	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number n : source) destiny.add(n);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) System.out.print(obj + " ");
	}

}
