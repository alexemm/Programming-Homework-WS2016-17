package Hausaufgabe09;

import java.util.ArrayList;

public abstract class Chessman {

	Position pos;

	public Chessman(Position pos) {
		this.pos = pos;
	}

	public Position getPosition() {
		return this.pos;
	}

	public void moveTo(Position pos) {
		if (!pos.isValid()) {
			throw new RuntimeException("Position is outside the field.");
		}

		if (!canMoveTo(pos)) {
			throw new RuntimeException("Position cannot move there in a turn");
		}

		this.pos = pos;
	}

	public abstract ArrayList<Position> getMoveList();

	public boolean canMoveTo(Position pos) {
		ArrayList<Position> tmp = this.getMoveList();
		for (int i = 0; i < tmp.toArray().length; i++) {
			if (tmp.get(i).equals(pos)) {
				return true;
			}
		}
		return false;
	}

	public abstract String toString();
}
