package Blatt12Vertiefung;

public class AXhochN implements Funktion {

	private double a;
	private double n;

	private AXhochN(double a, double n) {
		this.a = a;
		this.n = n;
	}

	@Override
	public double getY(double d) {
		// TODO Auto-generated method stub
		return a * Math.pow(d, n);
	}

	@Override
	public Funktion getAbleitung() {
		if (n == 0) {
			return Null.get();
		}
		return get(a * n, n - 1);
	}

	public String toString() {

		String a1 = "" + a;
		String xHoch = "x^";
		String n1 = "" + n;
		if (a == 1)
			a1 = "";

		if (n == 0) {
			xHoch = "";
			n1 = "";
		}

		if (n == 1.) {
			xHoch = "x";
			n1 = "";
		}
		String s = a1 + xHoch + n1;
		return s;
	}

	public static Funktion get(double a, double n) {
		if (a == 0)
			return Null.get();
		return new AXhochN(a, n);
	}

}
