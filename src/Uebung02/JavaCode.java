package Uebung02;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {

	private ArrayList<String> list;

	public JavaCode() {
		list = new ArrayList<String>();
	}

	public void ladeCode(Scanner sc) {
		while (sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
	}

	public void schreibeCode(PrintWriter pw) {
		/*
		 * for (String a: ) {
		 * 
		 * } }
		 * 
		 * public void entferneKommentare() { boolean block=false;
		 * 
		 * for (int i = 0; i < list.toArray().length; i++) { String s =
		 * list.get(i);
		 * 
		 * if (s.indexOf("/*")!=-1 && s.indexOf("
		 */ /*
			 * ")!=-1) { list.remove(i); i--; continue; }
			 * 
			 * if (s.indexOf("/*")!=-1 && s.indexOf("
			 */ /*
				 * ")==-1) { block= true; list.remove(i); i--; continue; }
				 * 
				 * if (block) { list.remove(i); i--; continue; }
				 * 
				 * if (s.indexOf("/*")!=-1) { block = true; list.remove(i); i--;
				 * continue; }
				 * 
				 * if (s.indexOf("
				 */ /*
					 * ")!=-1) { block = false; list.get(i) = s. }
					 * 
					 * if (s.indexOf("//") != -1) { String[] st = s.split("//");
					 * int j = 0;
					 * 
					 * list.remove(i); }
					 * 
					 * } }
					 */
	}
}
