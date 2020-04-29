package la_vector_has;

/**
 * Die Klasse VektorRn, die einen Vektor in der n. Dimensionen beschreibt und
 * entsprechende Operationen beinhaltet.
 * 
 * @version 1.2, November 2016
 * @author Alexander E.
 *
 */
public class VectorRn {

	// Der Vektor wird als double-Array eingespeichert.
	private double[] vector;

	/**
	 * Erzeugt ein Objekt der Klasse VektorRn aus einem double-Array. Die
	 * Dimension des Vektors ergibt sich aus der Laenge des eingegebenen Arrays.
	 * 
	 * @param vector
	 *            als double-Array
	 */
	public VectorRn(double[] vector) {

		// Der eingegebene double-Array wird dem Vektor zugewiesen
		this.vector = vector.clone();
	}

	/**
	 * Copy-Konstruktor fur einen Vektor.
	 * 
	 * @param v1
	 *            - Vektor, der kopiert werden soll
	 */
	public VectorRn(VectorRn v1) {
		this.vector = v1.getVector().clone();
	}

	/**
	 * Gibt den Vektor in Form eines double-Arrays zurueck
	 * 
	 * @return vector als double-Array
	 */
	public double[] getVector() {

		return vector;
	}

	/**
	 * Gibt die Dimension des Vektors zurueck
	 * 
	 * @return n - Dimension des Vektors
	 */
	public int getN() {
		return this.getVector().length;
	}

	/**
	 * Addiert die Vektoren und gibt das Ergebnisvektor zurueck
	 * 
	 * @param v2
	 *            - welches zum aktuellen Vektor dazuaddiert werden soll
	 * @return Ergebnisvektor von der Vektoraddition
	 * @throws RuntimeException
	 *             falls die Dimensionen der beiden Vektoren nicht gleich sind
	 */
	public VectorRn add(VectorRn v2) {

		// Abfrage, die Dimensionen ueberhaupt gleich sind
		if (v2.getN() != this.getN())
			throw new RuntimeException("Inkompatible Dimensionen!");

		// Ergebnis-Array fuer den neuen Vektor
		double[] ergebnis = new double[this.getVector().length];

		// Die jeweiligen Kompnenten werden addiert
		for (int i = 0; i < this.getN(); i++)
			ergebnis[i] = this.getVector()[i] + v2.getVector()[i];

		// Das neue Ergebnisvektor wird aus dem Ergebnis-Array erstellt...
		VectorRn ergebnisVector = new VectorRn(ergebnis);

		// ...und zurueckgegeben.
		return ergebnisVector;
	}

	/**
	 * Fuehrt eine Skalarmultiplikation mit dem Vektor durch und gibt das
	 * Ergebnis als Vektor zurueck.
	 * 
	 * @param d
	 *            - das Skalar, mit dem der Vektor multipliziert wird
	 * @return Ergebnisvektor von der Skalarmultiplikation
	 */
	public VectorRn mult(double d) {

		// Das Ergebnis-Array fuer den Ergebnisvektor wird deklariert
		double[] ergebnis = new double[this.getVector().length];

		// Die jeweiligen Komponenten werden mit dem Skalar multipliziert
		for (int i = 0; i < this.getN(); i++)
			ergebnis[i] = this.getVector()[i] * d;

		// Das neue Ergebnisvektor wird aus dem Ergebnis-Array erstellt...
		VectorRn ergebnisVector = new VectorRn(ergebnis);

		// ...und dann zurueckgegeben
		return ergebnisVector;
	}

	/**
	 * Gibt den Vektor in der transponierten Schreibweise als String zurueck
	 * 
	 * @return Vektor^T als String
	 */
	public String toString() {

		// String wird deklariert mit dem Beginn, auch bekannt als "Klammer auf"
		String s = "(";

		// Die Komponenten werden hinzugefuegt und durch ein Komma getrennt
		for (int i = 0; i < this.getN(); i++)
			s += this.getVector()[i] + ",";

		// Das letzte Komma wird entfernt
		s = s.substring(0, s.length() - 1);

		/*
		 * Die Klammer wird geschlossen und da wird ein "^T" fuer die
		 * transponierte Schreibweise hinzugefuegt. Dies wird dann
		 * zurueckgegeben
		 */
		return (s + ")^T");
	}

	/**
	 * Gibt das Ergebnis des Skalarproduktes der beiden eingegebenen Vektoren
	 * zurueck
	 * 
	 * @param v1
	 *            - Der erste Vektor des Skalarproduktes
	 * @param v2
	 *            - Der zweite Vektor des Skalarproduktes
	 * @return Ergebnis des Skalarproduktes als double-Variable
	 * @throws RuntimeException
	 *             falls die Dimensionen der beiden Vektoren nicht gleich sind
	 */
	public static double scalarProd(VectorRn v1, VectorRn v2) {

		// Abfrage, die Dimensionen ueberhaupt gleich sind
		if (v2.getN() != v1.getN())
			throw new RuntimeException("Inkompatible Dimensionen!");

		// double-Variable fuer den Ergebnis des Skalarproduktes wird deklariert
		double ergebnis = 0;

		/*
		 * Summe der Multiplikation der jeweiligen Komponenten wird gebildet und
		 * im Ergebnis eingespeichert.
		 */
		for (int i = 0; i < v1.getVector().length; i++)
			ergebnis += v1.getVector()[i] * v2.getVector()[i];

		// Das Ergebnis wird dann zurueckgegeben.
		return ergebnis;
	}

	/**
	 * Gibt die Standardnorm des Vektors zurueck
	 * 
	 * @return Standardnorm als double-Variable
	 */
	public double getNorm() {

		/*
		 * Per Definition ist die Standardnorm das Skalarprodukt des Vektors mit
		 * sich selbst und davon dann die Wurzel. Dies wird dann so
		 * zurueckgegeben.
		 */
		return Math.sqrt(VectorRn.scalarProd(this, this));
	}

	/**
	 * 
	 * @param v2
	 *            Vektor, dessen Parallelitaet zum aktuellen Objekt ueberprueft
	 *            werden soll
	 * @return boolean-Wert, ob beide Vektoren parallel zueinander sind
	 * 
	 * @throws RuntimeException
	 *             falls die Dimension des eingegebenen Vektors nicht zum Objekt
	 *             passt
	 */
	public boolean isParallel(VectorRn v2) {

		// Abfrage, die Dimensionen ueberhaupt gleich sind
		if (v2.getN() != this.getN())
			throw new RuntimeException("Inkompatible Dimensionen!");

		// fuer n = 1
		if (this.getN() == 1)
			return (true); // Parallelitaet ist immer gegeben

		// Skalar wird bestimmt
		int lambdaIndex = 0;
		try {
			while (v2.getVector()[lambdaIndex] == 0. || this.getVector()[lambdaIndex] == 0.)
				lambdaIndex++; // falls Nullskalar bestimmt werden wuerde
		} catch (ArrayIndexOutOfBoundsException c) { // Fall eines Nullvektors
			return true; // ein Nullvektor ist zu allem parallel
		}

		// lambda != 0: Skalar zum Vergleichen wird bestimmt
		double lambda = v2.getVector()[lambdaIndex] / this.getVector()[lambdaIndex];

		// Skalar wird verglichen
		for (int i = 1; i < this.getN(); i++) {

			// Falls einer der beiden Elemente 0 ist
			if (v2.getVector()[i] == 0 || this.getVector()[i] == 0) {

				// Beides 0
				if (v2.getVector()[i] == 0. && this.getVector()[i] == 0.) {
					continue;
				}
				return false; // nicht beides 0
			}
			if (v2.getVector()[i] / this.getVector()[i] != lambda)
				return false; // falls linear unabhaengig
		} // end of for

		return true;
	}

	/**
	 * 
	 * @param v1
	 *            - Vektor 1
	 * @param v2
	 *            - Vektor 2
	 * @return Eingeschlossener Winkel von beiden Vektoren
	 * 
	 * @throws RuntimeException
	 *             falls die Dimension des eingegebenen Vektors nicht zum Objekt
	 *             passt
	 * @throws ArithmeticException
	 *             falls der Winkel mit einem Nullvektor bestimmt werden soll
	 * 
	 */
	public static double getWinkel(VectorRn v1, VectorRn v2) {

		// Abfrage, die Dimensionen ueberhaupt gleich sind
		if (v2.getN() != v1.getN())
			throw new RuntimeException("Inkompatible Dimensionen!");

		// Falls Nullvektor
		if (v1.getNorm() == 0 || v2.getNorm() == 0) {
			throw new ArithmeticException("Nullvektor");
		}

		// Formel wird ausgegeben
		return Math.acos((VectorRn.scalarProd(v1, v2)) / (v1.getNorm() * v2.getNorm()));
	}

	/**
	 * 
	 * @param v1
	 *            der projezierende Vektor
	 * @param v2
	 *            der projezierte Vektor
	 * @return die Projektion von v1 auf v2 als Vektor
	 * @throws RuntimeException
	 *             falls die Dimension des eigegebenen Vektors nicht zum Objekt
	 *             passt
	 * @throws ArithmeticException
	 *             falls mit einem Nullvektor projeziert werden soll
	 */
	public static VectorRn projiziereV1AufV2(VectorRn v1, VectorRn v2) {

		// Abfrage, die Dimensionen ueberhaupt gleich sind
		if (v2.getN() != v1.getN())
			throw new RuntimeException("Inkompatible Dimensionen!");

		// Falls Nullvektor
		if (v2.getNorm() == 0)
			throw new ArithmeticException("Nullvektor");

		// Projektion gelingt dank Formel
		VectorRn projektion = new VectorRn(v2);
		return projektion.mult(VectorRn.scalarProd(v1, v2) / VectorRn.scalarProd(v2, v2));
	}

	/**
	 * Gibt ein VectorRn Array von den senkrechten Vektoren des Objekts zurueck.
	 * 
	 * @return senkrechte Vektoren zum Objekt als Array
	 */
	public VectorRn[] bestimmeSenkrechteVektoren() {

		// Nullvektor
		if (this.getNorm() == 0)
			throw new RuntimeException("Nullvektor");

		// Es geht erst ab n=2
		if (this.getN() < 2)
			throw new RuntimeException("Es koennen keine senkrechte Vektoren bestimmt werden.");

		// Rueckgabe-Array
		VectorRn[] ret = new VectorRn[this.getN() - 1];

		for (int i = 0; i < this.getN() - 1; i++) {

			/*
			 * Das erste Feld wird laufend behandelt, anschliessend geht man
			 * fuer alle Arrays durch
			 */
			double[] vek = new double[this.getN()];

			/*
			 * n1 nimmt jeden Wert "a(i+1)" an.
			 */
			vek[0] = this.getVector()[i + 1];
			vek[i + 1] = -this.getVector()[0]; // Lauf mit -a1 durch Array

			// Eingefuegt
			VectorRn zumEinfuegen = new VectorRn(vek);
			ret[i] = zumEinfuegen;
		}

		return ret;
	}
}