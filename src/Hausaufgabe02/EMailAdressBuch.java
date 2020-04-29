package Hausaufgabe02;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Die Klasse EMailAdressBuch, wo Textdateien aus Online- oder Offlinequellen
 * ausgelesen und eingespeichert werden
 * 
 * @version 1.0, Oktober 2016
 * @author Alexander E.
 *
 */
public class EMailAdressBuch {

	public static void main(String[] args) throws IOException {
		EMailAdressBuch e = new EMailAdressBuch();
		EMailAdressBuch f = new EMailAdressBuch();
		URL urlIntern = new URL(
				"https://doc.itc.rwth-aachen.de/download/attachments/5800183/mitarbeiter_matse_intern.txt");
		URL urlExtern = new URL(
				"https://doc.itc.rwth-aachen.de/download/attachments/5800183/mitarbeiter_matse_extern.txt");

		e.mitarbeiterEinlesen(urlIntern);
		e.mitarbeiterEinlesen(urlExtern);

		f.einlesen("emails.txt");
		//System.out.println(e.abfrage("Birgit Decker"));
		System.out.println(e);
		System.out.println(f);
	}

	// Speicherort fuer die Email-Adresseen und ihre Besitzer
	private HashMap<String, String> liste;

	/**
	 * Erstellt ein Objekt vom Typ EMailAdressBuch, wo Email-Adressen und ihre
	 * Besitzer eingespeichert werden koennen.
	 */
	public EMailAdressBuch() {

		/*
		 * Die Emailliste wird neu erstellt, sodass Adressen eingespeichert
		 * werden koennen.
		 */
		liste = new HashMap<String, String>();
	}

	/**
	 * Name und Email-Adresse werden dem Adressbuch hinzugefuegt.
	 * 
	 * @param name
	 *            der Kontaktperson
	 * @param email
	 *            der Kontaktperson
	 */
	public void einfuegen(String name, String email) {

		// Name - Key, Email - Value
		liste.put(name, email);
	}

	/**
	 * Gibt die Email-Adresse der eingegebenen Kontaktperson aus.
	 * 
	 * @param name
	 * @return Emailadresse der eingegebenen Kontaktperson
	 * @throws UnknownNameException
	 *             falls der Name nicht im Adressbuch steht
	 */
	public String abfrage(String name) {

		// Abfrage, ob der Name in der Liste ist
		if (liste.containsKey(name)) {
			return ((String) liste.get(name)); // Ja, ist er
		}

		// Nein, ist er nicht -> UnknownNameException
		throw new UnknownNameException("Der Name ist nicht im Adressbuch.");
	}

	/**
	 * Gibt das Adressbuch in Form eines Strings zurueck
	 * 
	 * @return EmailAdressBuch als String
	 */
	public String toString() {

		// Es wird sich der .toString()-Methode der HashMap zur Ausgabe bedient.
		return liste.toString();
	}

	/**
	 * Liest eine .txt-File aus und speichert die Namen und Emailadressen der
	 * Kontaktpersonen
	 * 
	 * @param dateiname
	 *            ggf auch Dateipfad
	 */
	public void einlesen(String dateiname) {

		// Eine File f und ein Scanner sc werden deklariert. sc liest f aus.
		File f = new File(dateiname);
		Scanner sc = null;

		/*
		 * Falls die Datei nicht gefunden wird, wird keine Fehlermeldung
		 * ausgegeben, sondern nur die Meldung auf der Console, dass die Datei
		 * nicht gefunden wird.
		 */
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException d) {
			System.out.println("Datei " + f + " nicht vorhanden");
			System.exit(1);
		}

		/*
		 * Die File wird ausgelesen und der HashMap hinzugefuegt.
		 */
		while (sc.hasNextLine()) {

			/*
			 * String-Array wird deklariert und es wird der gesplittete String
			 * uebergeben, sodass Name und Email getrennt sind.
			 */
			String[] s = sc.nextLine().split(";"); // sc[0]=name, sc[1]=email

			// Dies wird dann eingefuegt
			this.einfuegen(s[0], s[1]);
		}
	}

	/**
	 * Liest die Emailadressen und ihre Kontaktnamen aus dem Web aus und fuegt
	 * sie dem Adressbuch hinzu.
	 * 
	 * @param url
	 *            der Emailadressquelle
	 * @throws IOException falls was nicht mit dem Webfile oder der URL stimmt.
	 */
	public void mitarbeiterEinlesen(URL url) throws IOException {

		URLConnection con = url.openConnection();
		Object content = con.getContent();
		Scanner sc = new Scanner((InputStream) content);

		while (sc.hasNextLine()) {
			String[] s = sc.nextLine().split(";");
			this.einfuegen(s[0], s[1]);
		}
	}

}
