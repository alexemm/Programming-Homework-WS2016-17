package Hausaufgabe05;

public class Quadratwurzel implements Rechenoperation{
	
	@Override
	public double berechne(double x) {
		if (x<0) {
			throw new ArithmeticException("NaN");
		}
		return Math.sqrt(x);
	}

}
