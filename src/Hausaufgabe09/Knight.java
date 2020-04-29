package Hausaufgabe09;

import java.util.ArrayList;

public class Knight extends Chessman {

	public Knight(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {

		ArrayList<Position> ret = new ArrayList<Position>();

		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				Position tmp = new Position(i, j);

				int xPos = this.getPosition().getX();
				int yPos = this.getPosition().getY();

				 if (xPos == i || yPos == j) {
				 continue;
				 }

				int metrikX = Math.abs(xPos - i);
				int metrikY = Math.abs(yPos - j);

				if (metrikX + metrikY == 3) {
					ret.add(tmp);
				}
			}
		}
		return ret;
	}

	public String toString() {
		return "Springer: " + this.getPosition();
	}

}
