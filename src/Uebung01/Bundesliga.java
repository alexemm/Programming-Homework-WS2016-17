package Uebung01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bundesliga {

	private String[][] tabelle;
	private String[] mannschaften = { "FC Bayern München ", "Borussia Dortmund", "FC Schalke 04", "Bayer 04 Leverkusen",
			"Vfl Wolfsburg", "Borussia Mönchengladbach", "1. FSV Mainz", "FC Augsburg", "TSG 1899 Hoffenheim",
			"Hannover 96", "Hertha BSC", "Werder Bremen", "Eintracht Frankfurt", "SC Freiburg", "VfB Stuttgart",
			"Hamburger SV", "1. FC Nürnberg", "Eintracht Braunschweig" };

	public Bundesliga(String dateiname) {
		File f = new File("Bundesliga.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException d) {
			System.out.println("Datei " + f + " nicht vorhanden");
			System.exit(1);
		}
		
		tabelle = new String[18][18];
		for (int i=0;i<tabelle.length;i++) {
			String str = sc.nextLine().substring(25);
			tabelle[i]=str.split(" ");
				}
		}
	
	
	private int getMannschaftIndex(String m) {
		int i=0;
		for(;i<m.length();i++) {
			if(m.equals(mannschaften[i])) {
				break;
			}
		}
		return i;
	}
}
