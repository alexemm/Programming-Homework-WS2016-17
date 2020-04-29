package Hausaufgabe10;

/**
 * Eine klasse Klasse zur deutschen Darstellung einer Zahl als ausgeschriebenen
 * String.
 *
 * @author Michel K., Alexander E., Philipp D. (Hausaufgabengruppe 17)
 * @version 1.0, 19.12.2016
 */
public class ZahlwortDeutsch extends Zahlwort {

	int zahl;

	/**
	 * Konstruktor mit Int-Zahl als Parameter.
	 * 
	 * @param x
	 *            Die darzustellende Int-Zahl.
	 */
	public ZahlwortDeutsch(int x) {
		super(x);
		this.zahl = x;
	}

	/**
	 * Gibt die Zahl als ausgeschriebenen String in der jeweiligen Sprache
	 * zurueck.
	 *
	 * @return Das die Zahl als ausgeschriebener String.
	 */
	@Override
	public String getWortString() {
		String zahleingabe = "" + x;
		String zahlausgabe = "";

		aktualisiere(zahleingabe);

		if (zahleingabe.length() == 4) {
			int ziffer = zahleingabe.charAt(0) - 48;
			if (ziffer == 1) {
				zahlausgabe += "eintausend";
			} else {
				zahlausgabe += getZiffer(ziffer) + "tausend";
			}
			zahleingabe = zahleingabe.substring(1);
		}

		aktualisiere(zahleingabe);

		if (zahleingabe.length() == 3) {
			int ziffer = zahleingabe.charAt(0) - 48;
			if (ziffer == 1) {
				zahlausgabe += "einhundert";
			} else {
				zahlausgabe += getZiffer(ziffer) + "hundert";
			}
			zahleingabe = zahleingabe.substring(1);
		}

		aktualisiere(zahleingabe);

		if (zahleingabe.length() == 2) {
			if (zahleingabe.charAt(0) == '0' && zahleingabe.charAt(1) == '0') {

				return zahlausgabe;
			}
			if (zahleingabe.charAt(0) == '0' && zahleingabe.charAt(1) != '0') {

				zahlausgabe += "und" + getZiffer(zahleingabe.charAt(1) - 48);
				return zahlausgabe;
			}
			if (Integer.parseInt(zahleingabe) < 20) {
				switch (Integer.parseInt(zahleingabe)) {
				case 11:
					return zahlausgabe += "elf";
				case 12:
					return zahlausgabe += "zwoelf";
				case 13:
					return zahlausgabe += "dreizehn";
				case 14:
					return zahlausgabe += "vierzehn";
				case 15:
					return zahlausgabe += "fuenfzehn";
				case 16:
					return zahlausgabe += "sechzehn";
				case 17:
					return zahlausgabe += "siebzehn";
				case 18:
					return zahlausgabe += "achzehn";
				case 19:
					return zahlausgabe += "neunzehn";
				}
			}
			if (zahleingabe.charAt(0) != '0' && zahleingabe.charAt(1) == '0') {
				zahlausgabe += getZifferMalZehn(Integer.parseInt(zahleingabe));
				return zahlausgabe;
			}
			String unterscheidung = "";
			if (((int) zahleingabe.charAt(1) - 48) == 1) {
				unterscheidung = "ein";
			} else {
				unterscheidung = getZiffer(zahleingabe.charAt(1) - 48);
			}
			zahlausgabe += unterscheidung + "und"
					+ getZifferMalZehn(Integer.parseInt(zahleingabe.charAt(0) - 48 + "0"));

		}
		if (zahleingabe.length() == 1) {
			zahlausgabe += getZiffer(Integer.parseInt(zahleingabe));
		}
		return zahlausgabe;
	}

	private static String getZifferMalZehn(int zahl) {
		switch (zahl) {
		case 10:
			return "zehn";
		case 20:
			return "zwanzig";
		case 30:
			return "dreissig";
		case 40:
			return "vierzig";
		case 50:
			return "fuenfzig";
		case 60:
			return "sechzig";
		case 70:
			return "siebzig";
		case 80:
			return "achzig";
		case 90:
			return "neunzig";
		}
		return null;
	}

	/**
	 * Gibt die Sprache des Zahlwortes zurueck.
	 *
	 * @return Die Sprache als String.
	 */
	@Override
	public String getSprache() {
		return "deutsch";
	}

	private static String getZiffer(int ziffer) {
		switch (ziffer) {
		case 1:
			return "eins";
		case 2:
			return "zwei";
		case 3:
			return "drei";
		case 4:
			return "vier";
		case 5:
			return "fuenf";
		case 6:
			return "sechs";
		case 7:
			return "sieben";
		case 8:
			return "acht";
		case 9:
			return "neun";
		}
		return "";
	}

	private String aktualisiere(String zahl) {
		return "" + Integer.parseInt(zahl);
	}

}
