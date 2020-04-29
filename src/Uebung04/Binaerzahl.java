package Uebung04;


public class Binaerzahl {

	private String binZahl;
	private int maxStellen;

	public Binaerzahl(int zahl, int maxStellen) {

		if (zahl < 0)
			throw new ArithmeticException("negative Zahl");

		this.maxStellen = maxStellen;
		String binZahl2 = "";
		while (zahl != 0) {
			binZahl2 += zahl % 2;
			zahl /= 2;
		}

		binZahl = "";
		for (int i = binZahl2.length() - 1; i >= 0; i--) {
			binZahl += binZahl2.charAt(i);
		}

		if (this.maxStellen < binZahl.length() || this.maxStellen > 31)
			throw new ArithmeticException("Zu grosse Zahl!");
	}

	public String toString() {
		int vorBits = this.maxStellen - binZahl.length();
		String binNumber = "";
		for (int i = 0; i < vorBits; i++)
			binNumber += 0;
		return binNumber + this.binZahl;
	}

	public int getMaxStellen() {
		return maxStellen;
	}

	public void setMaxStellen(int maxStellen) {
		if (maxStellen > 31)
			throw new ArithmeticException("Zu viele Stellen");
		this.maxStellen = maxStellen;
	}

	public void add(Binaerzahl zahl2) {
		if (this.getMaxStellen() <= zahl2.getMaxStellen()) {
			this.maxStellen = zahl2.getMaxStellen();
		} else {
			zahl2.setMaxStellen(this.getMaxStellen());
		}

		boolean uebertrag = false;
		String reverseZahl = "";
		for (int i = maxStellen - 1; i >= 0; i--) {
			int counter = 0;
			if (uebertrag)
				counter++;
			if (this.toString().charAt(i) == '1')
				counter++;
			if (zahl2.toString().charAt(i) == '1')
				counter++;

			switch (counter) {
			case 0:
				reverseZahl += 0;
				uebertrag = false;
				break;
			case 1:
				reverseZahl += 1;
				uebertrag = false;
				break;
			case 2:
				reverseZahl += 0;
				uebertrag = true;
				break;
			case 3:
				reverseZahl += 1;
				uebertrag = true;
				break;
			}
		}

		binZahl = "";

		for (int i = reverseZahl.length() - 1; i >= 0; i--) {
			binZahl += reverseZahl.charAt(i);
		}

		if (uebertrag)
			throw new ArithmeticException("Zu gross addiert.");
	}

	public void zweierkomplement() {
		String zwKom = "";
		for (int i = 0; i < this.getMaxStellen(); i++) {
			if (this.binZahl.charAt(i) == '1')
				zwKom += 0;
			else
				zwKom += 1;
		}
		
		String reverseZahl = "";
		boolean uebertrag = true;
		for (int i = zwKom.length() - 1; i >= 0; i--) {
			int counter = 0;
			if (uebertrag)
				counter++;
			if (zwKom.charAt(i) == '1')
				counter++;

			switch (counter) {
			case 0:
				reverseZahl += 0;
				uebertrag = false;
				break;
			case 1:
				reverseZahl += 1;
				uebertrag = false;
				break;
			case 2:
				reverseZahl += 0;
				uebertrag = true;
				break;
			}
		}
		binZahl = "";

		for (int i = reverseZahl.length() - 1; i >= 0; i--) {
			binZahl += reverseZahl.charAt(i);
		}
	}
}
