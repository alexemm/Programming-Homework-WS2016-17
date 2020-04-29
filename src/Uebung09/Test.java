package Uebung09;

import java.awt.Point;

public class Test {
	public static void main(String[] args) { 
		Grafik g = new Grafik(300, 300); // Groesse der Grafik

		// Linie von (10/10) nach (200/100)
		// Der Koordinatenursprung ist links oben
		//Linie l = new Linie(new Point(50, 50), new Point(200, 100));
		//g.add(l);
		g.aktualisiere(0);
	   Rechteck r = new Rechteck(new Point(50,50), new Point(200,100));
	    g.add(r);
	    g.aktualisiere(0);
	    
	    //r.skaliere(0.5);
	    //g.add(r);
	    //g.aktualisiere(0);
	  }
}

