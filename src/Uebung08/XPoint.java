package Uebung08;

import java.awt.Point;

public class XPoint extends Point {

	Point p20;

	public XPoint(double x, double y) {
		p20=new Point();
		p20.setLocation(x, y);
	}
	
	public void swap(Point p) {
		p20.setLocation(p);
	}

	public boolean isOnLine(Point p1, Point p2) {
		double deltaY = p2.getY() - p1.getY();
		double deltaX = p2.getX() - p1.getX();
		double steigung = deltaY / deltaX;
		double ySchnitt = p1.y - steigung * p1.x;
		return (this.p20.getY() == steigung * this.p20.getX() + ySchnitt);
	}

	public double getR() {
		double x=this.p20.getX();
		double y =this.p20.getY();
		return Math.sqrt(x * x + y * y);
	}

	public double getPhi() {
		return Math.acos(x / this.getR());
	}
}
