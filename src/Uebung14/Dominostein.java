package Uebung14;

public class Dominostein {
	private int a;
	private int b;

	public Dominostein(int a, int b) {
		if (a > 6 || a < 1 || b > 6 || b < 1)
			throw new NumberFormatException("Falsches Format");
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "[" + a + "," + b + "}";
	}

	public void dreheUm() {
		int hilf = a;
		this.a = b;
		this.b = hilf;
	}

	public int[] getValues() {
		int[] ret = { this.a, this.b };
		return ret;
	}
}
