package Hausaufgabe05;

public class Addition implements Rechenoperation{
	double zahl;
	
	public Addition (double zahl) {
		this.zahl = zahl;
	}

	@Override
	public double berechne(double x) {
		return x + this.zahl;
	}
}
