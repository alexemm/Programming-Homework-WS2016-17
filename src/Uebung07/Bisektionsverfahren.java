package Uebung07;
public class Bisektionsverfahren implements Verfahren{

	@Override
	public double getNullstelle(Funktion f, double xMin, double xMax) {
		// TODO Auto-generated method stub
		double xM = (xMin+xMax)/2;
		while (xMax-xMin>Math.pow(10, -10)) {
			
			if (Math.abs(f.getY(xM))<Math.pow(10, -10)) {
				return xM;
			}
			if ((f.getY(xMin))*(f.getY(xMax))<0) {
				xMax=xM;
			}
			else if ((f.getY(xMax))*(f.getY(xMax))<0) {
				xMin=xM;
			}
			xM = (xMin+xMax)/2;
		}
		return Double.MAX_VALUE;
	}
	
}
