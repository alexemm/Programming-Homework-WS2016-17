package Hausaufgabe10;

/**
 * Eine klasse Klasse zur englischen Darstellung einer Zahl als ausgeschriebenen
 * String.
 *
 * @author Michel K., Alexander E., Philipp D. (Hausaufgabengruppe 17)
 * @version 1.0, 19.12.2016
 */
public class ZahlwortEnglisch extends Zahlwort {

	int zahl;

	/**
	 * Konstruktor mit Int-Zahl als Parameter.
	 * 
	 * @param x
	 *            Die darzustellende Int-Zahl.
	 */
	public ZahlwortEnglisch(int x) {
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
				zahlausgabe += "one thousand ";
			} else {
				zahlausgabe += getZiffer(ziffer) + " thousand ";
			}
			zahleingabe = zahleingabe.substring(1);
		}

		aktualisiere(zahleingabe);

		boolean uebergang = false;

		if (zahleingabe.length() == 3) {
			if (zahleingabe.charAt(0) != '0') {
				int ziffer = zahleingabe.charAt(0) - 48;
				if (ziffer != 0) {
					if (ziffer == 1) {
						zahlausgabe += "one hundred";
					} else {
						zahlausgabe += getZiffer(ziffer) + " hundred";
					}

					uebergang = true;
				}
			}
			zahleingabe = zahleingabe.substring(1);
		}
		if (!zahlausgabe.equals("") && zahleingabe.length() == 1) {
			if (zahleingabe.equals("00")) {
				return zahlausgabe;
			}
			if (zahleingabe.equals("0")) {
				return zahlausgabe;
			}
			zahleingabe = "0" + zahleingabe;
		}

		if (zahleingabe.length() == 2) {
			if (zahleingabe.charAt(0) == '0' && zahleingabe.charAt(1) != '0') {
				zahlausgabe += " and " + getZiffer(zahleingabe.charAt(1) - 48);
				return zahlausgabe;
			}
			String and = "";
			if (uebergang == true) {
				and = " and ";
			}
			if (Integer.parseInt(zahleingabe) < 20) {
				switch (Integer.parseInt(zahleingabe)) {
				case 11:
					return zahlausgabe += and + "eleven";
				case 12:
					return zahlausgabe += and + "twelve";
				case 13:
					return zahlausgabe += and + "thirteen";
				case 14:
					return zahlausgabe += and + "fourteen";
				case 15:
					return zahlausgabe += and + "fifteen";
				case 16:
					return zahlausgabe += and + "sixteen";
				case 17:
					return zahlausgabe += and + "seventeen";
				case 18:
					return zahlausgabe += and + "eighteen";
				case 19:
					return zahlausgabe += and + "nineteen";
				}
			}
			if (zahleingabe.charAt(0) != '0' && zahleingabe.charAt(1) == '0') {
				zahlausgabe += and + getZifferMalZehn(Integer.parseInt(zahleingabe));
				return zahlausgabe;
			}

			zahlausgabe += and + ""+ getZifferMalZehn(Integer.parseInt(zahleingabe.charAt(0) - 48 + "0")) + "-"
					+ getZiffer(zahleingabe.charAt(1) - 48);
			if (zahlausgabe.charAt(zahlausgabe.length() - 1) == '-') {
				zahlausgabe = zahlausgabe.substring(0, zahlausgabe.length() - 6);
			}
		}
		if (zahleingabe.length() == 1) {
			zahlausgabe = getZiffer(Integer.parseInt(zahleingabe));
		}
		return zahlausgabe;
	}

	private static String getZifferMalZehn(int zahl) {
		switch (zahl) {
		case 10:
			return "ten";
		case 20:
			return "twenty";
		case 30:
			return "thirty";
		case 40:
			return "forty";
		case 50:
			return "fifty";
		case 60:
			return "sixty";
		case 70:
			return "seventy";
		case 80:
			return "eighty";
		case 90:
			return "ninety";
		}
		return "";
	}

	private static String getZiffer(int ziffer) {
		switch (ziffer) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		}
		return "";
	}

	/**
	 * Gibt die Sprache des Zahlwortes zurueck.
	 *
	 * @return Die Sprache als String.
	 */
	@Override
	public String getSprache() {
		return "englisch";
	}

	private static String aktualisiere(String zahl) {
		return "" + Integer.parseInt(zahl);
	}
}
