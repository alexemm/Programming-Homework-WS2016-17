package Hausaufgabe06;

public class DasSpiel {

	public static void main(String[] args) {
		// Neues Objekt vom Typ GefDilemma mit 2 Spielern
		GefDilemma gd = new GefDilemma(new TitForTat(), new Random());
		// 100 mal spielen
		gd.spiele(100);
	}
}
