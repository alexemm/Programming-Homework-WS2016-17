package Hausaufgabe09;

import java.util.ArrayList;

public class Rook extends Chessman {

	public Rook(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {
		ArrayList<Position> ret = new ArrayList<Position>();
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				Position tmp = new Position(i, j);

				if (this.getPosition().equals(tmp)) {
					continue;
				}

				if (this.getPosition().getX() == i || this.getPosition().getY() == j) {
					ret.add(tmp);
				}
			}
		}
		return ret;
	}

	@Override
	public String toString() {
		return "Turm: " + this.getPosition();
	}

}
