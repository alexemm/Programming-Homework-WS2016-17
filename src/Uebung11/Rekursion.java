package Uebung11;

import javax.swing.JOptionPane;

public class Rekursion {

	public static void main(String[] args) {
		fibonacciAusgabe(Integer.parseInt(JOptionPane.showInputDialog("Gib Zahl ein:")));
	}

	public static long fibonacci(int n) { // Aufgabe 2
		if (n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void fibonacciAusgabe(int n) { // auch rekursiv!
		if (n == 0)
			return;
		fibonacciAusgabe(n - 1);
		System.out.println(fibonacci(n));
		
	}
	
	public static long fakultaet(int n) { // Aufgabe 1
		if (n == 0)
			return 1;
		return n * fakultaet(n - 1);
	}
	
	public static int summe(int anfang, int ende) { // Aufgabe 3
		if (anfang > ende)
			return 0;
		if (anfang == ende)
			return anfang;
		return anfang + ende + summe(anfang + 1, ende - 1);
	}

	public static int ggt(int a, int b) { // Aufgabe 4
		if (a == b)
			return a;
		if (a > b)
			return ggt(a - b, b);
		return ggt(a, b - a);
	}

	public static int getPascalWert(int i, int j) { // Aufgabe 5
		if (j == 0 || j == i)
			return 1;
		return getPascalWert(i - 1, j) + getPascalWert(i - 1, j - 1);
	}

	public static void rekursiveAusgabe(int n) { // Aufgabe 6
		if (n == 0)
			return;
		rekursiveAusgabe(n / 10);
		System.out.println(n % 10);
	}

	public static void rekursiveAusgabeRueckwaerts(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n % 10);
		rekursiveAusgabe(n / 10);
	}

	// public static String umkehren(String s) {
	//
	// }

	public static void geldautomat(int betrag) {
		if (betrag < 5) {
			return;
		}
		if (betrag > 500) {
			System.out.println(" " + 500);
			geldautomat(betrag - 500);
		}
		if (betrag < 500) {
			System.out.println(" " + 200);
			geldautomat(betrag - 200);
		}
		if (betrag < 200) {
			System.out.println(" " + 100);
			geldautomat(betrag - 100);
		}
		if (betrag < 100) {
			System.out.println(" " + 50);
			geldautomat(betrag - 50);
		}
		if (betrag < 50) {
			System.out.println(" " + 20);
			geldautomat(betrag - 20);
		}
		if (betrag < 20) {
			System.out.println(" " + 10);
			geldautomat(betrag - 10);
		}
		if (betrag < 10) {
			System.out.println(" " + 5);
			geldautomat(betrag - 5);
		}

	}

}
