package Uebung08;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		NewArrayList a = new NewArrayList() ;
		for (int i=0;i<5;i++) {
			a.add(i);
		}
		a.add(2.5);
		a.add("3.5");
		a.add("5");
		a.add("Hallo");
		a.add(7);
		a.add("3.2.4.2");
		
		ArrayList r = a.getDoubles();
		ArrayList s = a.getIntegers();
		
		ArrayList t = new ArrayList();
		try {
			t = a.getStrings();
		} catch (WrongElementException e) {
			System.out.println(e.getIndex());
		}
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		
	}
}
