package Hausaufgabe01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Die Klasse GoldPreis, von dem eine Datei ausgelesen wird und die
 * Goldtagespreise eingespeichert werden
 * 
 * @version 1.0, Oktober 2016
 * @author Alexander E.
 *
 */
public class GoldPreis {

	// Die Tagespreise mit den Daten werden hier in einem Objekt gespeichert.
	private ArrayList<GoldTagespreis> list = new ArrayList<GoldTagespreis>();

	/**
	 * Erstellt ein Objekt vom Typ GoldPreis, wo die eingegebene .txt Datei
	 * ausgelesen, in Objekten vom Typ GoldTagespreis gespeichert, und der
	 * ArrayList der Klasse uebergeben wird.
	 * 
	 * @param dateiname
	 *            Dateiname, ggf. auch den Dateipfad
	 * @throws FileNotFoundException
	 *             falls die File nicht existiert oder bei einer falschen
	 *             Pfadangabe (aus der vorgegebenen Methode zum Austesten, damit
	 *             diese es behandelt)
	 */
	public GoldPreis(String dateiname) throws FileNotFoundException {

		/*
		 * Eine File f und ein Scanner sc werden deklariert. sc liest f aus.
		 * Falls eine FileNotFoundException auftaucht, wird diese von der
		 * Methode ausgegeben, sodass die in der Aufgabenstellung vorgegegebene
		 * Methode zum Austesten sie behandelt.
		 */
		File f = new File(dateiname);
		Scanner sc = new Scanner(f);

		// Einlesen und Einspeichern in die ArrayList der Klasse
		while (sc.hasNextLine()) {

			/*
			 * Von sc wird die Zeile auselesen und in einem String gespeichert
			 */
			String g = sc.nextLine();

			// Einteilung von g in Substrings
			String g1 = g.substring(0, 10); // Datum
			String g2 = g.substring(11).trim(); // Preis

			/*
			 * Aenderung des Gleitkommazahlenformates zum amerikanischen System
			 */
			g2 = g2.replace(".", " ");
			g2 = g2.replace(",", ".");

			// Entfernung des Leerzeichens und Zusammenfuehrung der Zahlen
			String[] g3 = g2.split(" ");
			g2 = g3[0] + g3[1]; // Preis fuer den double-Format

			// Deklaration der double-Variable preis vom Tagespreis
			double preis;

			/*
			 * Der try-catch-Block existiert, weil es Tage ohne Angabe gibt.
			 * Wenn kein double-Wert geparst werden kann, wird der preis -1
			 * gesetzt.
			 */
			try {
				preis = Double.parseDouble(g2);
			} catch (NumberFormatException n) {
				preis = -1;
			}

			/*
			 * Die gefundenen Werte werden in einem Objekt der Klasse
			 * GoldTagespreis gespeichert und der ArrayList der Klasse
			 * hinzugefuegt.
			 */
			GoldTagespreis xatar = new GoldTagespreis();
			xatar.datum = g1;
			xatar.preis = preis;
			list.add(xatar);
		} // Ende der while=Schleife

		// Der Scanner sc wird geschlossen.
		sc.close();
	}

	/**
	 * Gibt den Tagespreis vom eingegebenen Datum zurueck.
	 * 
	 * 
	 * @param datum
	 *            - von dem der Tagespreis zurueckgegeben wird
	 * @return Tagespreis vom eingegebenen Datum (an Feiertagen oder Wochenenden
	 *         wird -1.0 zurueckgegeben)
	 * @throws NumberformatException
	 *             falls der Format vom Datum falsch ist oder das Datum im
	 *             Objekt nicht aufgezeichnet ist
	 */

	public double getPreis(String datum) {

		/*
		 * Das Datum vom eingegebenen String wird gesucht und der Tagespreis
		 * wird zurueckgegeben.
		 */
		for (int i = 0; i < list.toArray().length; i++) {

			// Es wird abgefragt, ob das Datum passt.
			if (list.get(i).datum.equals(datum))
				return list.get(i).preis;
		} // Ende der for-Schleife

		/*
		 * Falls das Datum durch die for-Schleife kommt, wird eine
		 * NumberFormatException ausgegeben, da entweder das falsche Format oder
		 * ein Datum gewaehlt wurde, das nicht ausgelesen wurde.
		 */
		throw new NumberFormatException("Eingegebener String passt nicht zu Datum");
	}

	/**
	 * Gibt auf der Console die Daten vom Mindestpreis und vom Maximalpreis aus.
	 */

	public void printMinMax() {

		/*
		 * Deklaration der Variablen fuer den Mindest- und Maximalpreis und
		 * Zuweisung zum Preis des ersten Tages.
		 */
		double minPreis = list.get(0).preis;
		double maxPreis = list.get(0).preis;

		/*
		 * Fuer den Fall, dass die ersten Tage den Mindestpreis von -1.0
		 * besitzen, da diese nicht gelten. Der Mindestpreis wird zum ersten
		 * gueltigen Preis. Die deklarierte Variable lauf ist eine Laufvariable
		 * bis zur Bedingung.
		 */
		int lauf = 1;
		while (minPreis == -1) { // Beginn der while-Schleife
			minPreis = list.get(lauf).preis;
			lauf++;
		} // Ende der while-Schleife

		// Bestimmung des Mindes- und Maximalpreises
		for (int i = 1; i < list.toArray().length; i++) {

			// Deklaration der Variable d fuer den Tagespreis
			double d = list.get(i).preis;

			/*
			 * Abfrage, ob d kleiner als der aktuelle Mindestpreis und ungleich
			 * -1 (also der ungueltige Wert) ist. Wenn dem so ist, wird d zum
			 * Mindestpreis
			 */
			if (minPreis > d && d != -1)
				minPreis = d;

			/*
			 * Abfrage, ob d groesser als der aktuelle Maximalpreis ist. Wenn
			 * dem so ist, wird d zum Maximalpreis.
			 */
			if (maxPreis < d)
				maxPreis = d;
		} // Ende der for-Schleife

		/*
		 * Deklaration des Strings s, welches spaeter ausgegeben wird. Man
		 * beginnt mit den Tagen des Mindestpreises.
		 * 
		 */
		String s = ("Den niedrigsten Goldpreis von " + minPreis + " gab es an folgenden Tagen:\n");

		// Hinzugefuegt zu s werden die Daten des Mindestpreises
		for (int i = 0; i < list.toArray().length; i++) {
			if (minPreis == list.get(i).preis)
				s += list.get(i).datum + "\n";
		} // Ende der for-Schleife

		// Dann folgt der Maximalpreis...
		s += "Den hoechsten Goldpreis von " + maxPreis + " gab es an folgenden Tagen:\n";

		// ...mit den jeweiligen Daten.
		for (int i = 0; i < list.toArray().length; i++) {
			if (maxPreis == list.get(i).preis)
				s += list.get(i).datum + "\n";
		} // Ende der for-Schleife

		// s wird dann auf der Console ausgegeben.
		System.out.println(s);
	}
}