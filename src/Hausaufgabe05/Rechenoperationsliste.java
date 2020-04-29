package Hausaufgabe05;

import java.util.ArrayList;

/**
 * Liste von Rechenoperationen
 * 
 * @author ealexem
 *
 */
public class Rechenoperationsliste {

	ArrayList<Rechenoperation> liste;

	/**
	 * Initialisiert die Liste von Rechenoperationen
	 */
	public Rechenoperationsliste() {
		liste = new ArrayList<Rechenoperation>();
	}

	/**
	 * Fuegt Rechenoperation hinzu
	 * 
	 * @param operation
	 */
	public void add(Rechenoperation operation) {
		liste.add(operation);
	}

	/**
	 * 
	 * @param feld
	 * @return
	 */
	public double[] transform(double[] feld) {
		double[] ret = new double[feld.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = feld[i];
			for (int j = 0; j < this.liste.toArray().length; j++) {
				ret[i] = liste.get(j).berechne(ret[i]);
			}
		}
		return ret;
	}
}
