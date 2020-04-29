package Blatt12Vertiefung;

public class GebrochenRational implements Funktion{
	
	double a;
	
	private GebrochenRational(double a) {
		this.a=a;
	}

	@Override
	public double getY(double d) {
		// TODO Auto-generated method stub
		return a/d;
	}

	@Override
	public Funktion getAbleitung() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Funktion get(double a) {
		if (a == 0)
			return Null.get();
		return new GebrochenRational(a);
	}
}
