package Uebung09;

import java.awt.Point;

public class Rechteck extends Figur {

	Point p1;
	Point p2;
	Point p3;
	Point p4;
	Point mittelp;
	int deltaX;
	int deltaY;

	public Rechteck(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		p3 = new Point(p1.x, p2.y);
		p4 = new Point(p2.x, p1.y);
		mittelp = new Point((p1.x + p4.x) / 2, (p4.y + p2.y) / 2);
		punkte.add(p1);
		punkte.add(p4);
		punkte.add(p2);
		punkte.add(p3);
		punkte.add(p1);
		deltaX = Math.abs(p1.x = mittelp.x);
		deltaY = Math.abs(p1.y - mittelp.y);
	}

	public Rechteck(Rechteck r) {
		this.p1 = new Point(r.p1);
		this.p2 = new Point(r.p2);
		this.p3 = new Point(r.p3);
		this.p4 = new Point(r.p4);
		punkte.add(p1);
		punkte.add(p4);
		punkte.add(p2);
		punkte.add(p3);
		punkte.add(p1);
		deltaX = Math.abs(p1.x - mittelp.x);
		deltaY = Math.abs(p1.y - mittelp.y);
	}

	public void skaliere(double d) {
		Point p1s = new Point((int) (mittelp.x - d * deltaX), (int) (mittelp.y - d * deltaY));
		Point p2s = new Point((int) (mittelp.x + d * deltaX), (int) (mittelp.y + d * deltaY));
		Point p3s = new Point((int) (mittelp.x - d * deltaX), (int) (mittelp.y + d * deltaY));
		Point p4s = new Point((int) (mittelp.x + d * deltaX), (int) (mittelp.y - d * deltaY));
		Rechteck n = new Rechteck(p1s, p2s);
		p1 = new Point(p1s);
		p2 = new Point(p2s);
		p3 = new Point(p3s);
		p4 = new Point(p4s);
		punkte.add(p1);
		punkte.add(p4);
		punkte.add(p2);
		punkte.add(p3);
		punkte.add(p1);

	}

	public Rechteck vereinige(Rechteck r) {
		return r;
	}

	public String toString() {

		int hoehe = Math.abs(p1.y - p3.y);
		int breite = Math.abs(p1.x - p4.x);
		return ("Rechteck: Hoehe = " + hoehe + " Breite = " + breite);
	}

}
