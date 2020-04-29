package Hausaufgabe09;

public class Position {

	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean equals(Position p) {
		return (this.getX() == p.getX() && this.getY() == p.getY());
	}

	public boolean isValid() {
		boolean xValid = this.getX() > 0 && this.getX() < 9;
		boolean yValid = this.getY() > 0 && this.getX() < 9;
		return xValid && yValid;
	}

	public String toString() {
		return "(" + this.getX() + "/" + this.getY() + ")";
	}
}
