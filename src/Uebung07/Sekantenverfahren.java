package Uebung07;


public class Sekantenverfahren implements Verfahren{

	@Override
	public double getNullstelle(Funktion f, double xMin, double xMax) {
		
		double xM = (xMin*f.getY(xMax)-xMax*f.getY(xMin))/(f.getY(xMax)-f.getY(xMin));
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
			xM = (xMin*f.getY(xMax)-xMax*f.getY(xMin))/(f.getY(xMax)-f.getY(xMin));
		}
		return Double.MAX_VALUE;
	}

}
