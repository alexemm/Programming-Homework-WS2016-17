package Uebung00;

import java.io.*;
import java.util.*;

public class Messreihe {

	public static void main(String[] args) {
		Messreihe m = new Messreihe("Messwerte");
	}

	private double[] liste;

	public Messreihe(double[] liste) {
		this.liste = liste;
	}

	public Messreihe(String dateiname) {
		File f = new File("Messwerte.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException d) {
			System.out.println("Datei " + f + " nicht vorhanden");
			System.exit(1);
		}

		int anzahl = 0;

		while (anzahl == 0) {
			try {
				anzahl = Integer.parseInt(nextLine(sc));
			} catch (NumberFormatException n) {

			}
		}

		int counter = 0;
		liste = new double[anzahl];

		while (sc.hasNextLine()) {
			if (counter > anzahl) {
				liste = null;
				throw new ArithmeticException("Anzahl stimmt nicht ueberein.");
			}
			try {
				this.liste[counter] = Double.parseDouble(nextLine(sc));
				counter++;
			} catch (ArrayIndexOutOfBoundsException a) {
				throw new ArithmeticException("Anzahl stimmt nicht ueberein.");
			}
		}

		sc.close();
	}

	private String nextLine(Scanner sc) {
		String str = sc.nextLine();

		if (str.charAt(0) == '%' || str.charAt(0) == ' ') {
			return "";
		}

		try {
			double a = Double.parseDouble(str);
		} catch (NumberFormatException o) {
			throw new IllegalArgumentException("falsches Datenformat");
		}

		return str;
	}

	public double getMax() {
		double max = this.liste[0];
		for (int i = 1; i < this.liste.length; i++) {
			if (liste[i] > max) {
				max = liste[i];
			}
		}
		return max;
	}

	public double getMin() {
		double min = this.liste[0];
		for (int i = 1; i < liste.length; i++) {
			if (liste[i] < min) {
				min = liste[i];
			}
		}
		return min;
	}

	public boolean isEinheitlich() {
		double element = this.liste[0];
		for (int i = 1; i < liste.length; i++) {
			if (liste[i] != element)
				return false;
		}
		return true;
	}

	public int zaehleGroessere(int lim) {
		int counter = 0;
		for (int i = 0; i < this.liste.length; i++) {
			if (this.liste[i] > lim)
				counter++;
		}
		return counter;
	}
	
	public int getMaxIndex() {
		int maxIndex=0;
		double maxWert=this.liste[maxIndex];
		for(int i=1;i<this.liste.length;i++) {
			if (this.liste[i]>maxWert) {
				maxWert=this.liste[i];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	
	public double[] getBereich() {
		double[] x=null;
		return x;
	}
	
	

}
