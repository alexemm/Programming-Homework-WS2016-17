package Blatt12Vertiefung;
public class Null implements Funktion {

	private static final Null n = new Null();

	private Null() {

	}

	@Override
	public double getY(double d) {
		return 0;
	}

	@Override
	public Funktion getAbleitung() {
		return this;
	}

	public String toString() {
		return "0";
	}

	public static Funktion get() {
		return n;
	}
}
