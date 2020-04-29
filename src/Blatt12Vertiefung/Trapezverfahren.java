package Blatt12Vertiefung;

import javax.swing.JOptionPane;

public class Trapezverfahren {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Untere Grenze"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Obere Grenze"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Iteration"));
		System.out.println("Integral normal: " + ((Math.log(b)) - Math.log(a)));
		System.out.println("Integral Trapez: " + integral(n, a, b));
	}

	public static double integral(int n, double a, double b) {
		double deltaX = (b - a) / n;
		double ret = 0;
		for (int i = 0; i < n; i++) {
			int mal2;
			if (i != 0 || i != n - 1) {
				mal2 = 2;
			} else {
				mal2 = 1;
			}
			ret += (((mal2 * deltaX) / 2.) * getX(a + i * deltaX));
		}
		return ret;

	}

	private static double getX(double d) {
		Funktion f1 = GebrochenRational.get(1);
		return f1.getY(d);
	}

}
