package Blatt12Vertiefung;

public class Summe implements Funktion {

	public Funktion f1;
	public Funktion f2;

	private Summe(Funktion f1, Funktion f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public double getY(double d) {
		// TODO Auto-generated method stub
		return f1.getY(d) + f2.getY(d);
	}

	@Override
	public Funktion getAbleitung() {
		if (f1.getClass().getName() == "Uebung10.Null") {
			if (f2.getClass().getName() == "Uebung10.Null") {
				return Null.get();
			}
			return f2.getAbleitung();
		}
		if (f2.getClass().getName() == "Uebung10.Null") {
			if (f1.getClass().getName() == "Uebung10.Null") {
				return Null.get();
			}
			return f1.getAbleitung();
		}
		return new Summe(f1.getAbleitung(), f2.getAbleitung());
	}

	public static Funktion get(Funktion f1, Funktion f2) {
		if (f1.getClass().getName() == "Uebung10.Null") {
			if (f2.getClass().getName() != "Uebung10.Null") {
				return f2;
			}
			return Null.get();
		}
		if (f2.getClass().getName() == "Uebung10.Null") {
			if (f1.getClass().getName() != "Uebung10.Null") {
				return f1;
			}
			return Null.get();
		}
		return new Summe(f1, f2);
	}

	public String toString() {
		return f1.toString() + "+" + f2.toString();
	}

}
