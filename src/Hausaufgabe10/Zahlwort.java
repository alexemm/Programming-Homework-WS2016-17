package Hausaufgabe10;

/**
 * Eine abstrakte Klasse zur Stringausgabe einer Int-Zahl als ausgeschriebenes Wort.
 */
public abstract class Zahlwort {
	protected int x;

	/**
	 * Konstruktor mit Int-Zahl als Parameter.
	 * @param x Die darzustellende Int-Zahl.
	 */
	public Zahlwort(int x) {
		if (x<=0 || x>=10000) {
			throw new NumberFormatException("Zahl nicht im "+
					" Bereich zwischen 1 und 9999");
		} else {
			this.x = x;
		}
	}

	/**
	 * Gibt die Dezimaldarstellung der Zahl zurueck.
	 * @return Die Dezimaldarstellung als String.
	 */
	public String getZifferString() {
		return x+"";
	}

	/**
	 * Gibt die Zahl als ausgeschriebenen String in der jeweiligen Sprache zurueck.
	 * @return Das die Zahl als ausgeschriebener String.
	 */
	public abstract String getWortString();

	/**
	 * Gibt die Sprache des Zahlwortes zurueck.
	 * @return Die Sprache als String.
	 */
	public abstract String getSprache();

	/**
	 * Die Standard toString-Methode, die die Zahl, das Zahlwort und die Sprache als String zurueck gibt.
	 * @return Der String.
	 */
	public String toString() {
		return "Die Zahl "+x+" schreibt man auf " + getSprache() + ": "+getWortString()+".";
	}
}