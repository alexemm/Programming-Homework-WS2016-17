package Hausaufgabe08;

public class Schiebepuzzle {

	private int[][] puzzle;

	public Schiebepuzzle() {
		puzzle = new int[][] { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 }, { 4, 8, 12, 0 } };
	}

	public void schiebe(int i) {
		if (!istVerschiebbar(i)) {
			throw new WrongMoveException("Turn is not possible");
		}
		if (i < 0 || i > 15) {
			throw new WrongNumberException("Plate does not exist");
		}

		int x = getPosX(i);
		int y = getPosY(i);
		int x0 = getPosX(0);
		int y0 = getPosY(0);

		puzzle[x0][y0] = i;
		puzzle[x][y] = 0;
	}

	public boolean istVerschiebbar(int i) {
		int x = getPosX(i);
		int y = getPosY(i);
		int x0 = getPosX(0);
		int y0 = getPosY(0);

		return Math.abs(x - x0 + y - y0) == 1;
	}

	public int getPosY(int i) {
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				if (i == puzzle[j][k]) {
					return k;
				}
			}
		}
		return 0;
	}

	public int getPosX(int i) {
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
				if (i == puzzle[j][k]) {
					return j;
				}
			}
		}
		return 0;
	}

	public void mische() {

		// Bogo Sort for life
		for (int i = 0; i < 100000; i++) {
			int j = (int) (Math.random() * 15 + 1);
			if (istVerschiebbar(j)) {
				schiebe(j);
			} else {
				i--;
			}
		}
	}

	public String toString() {
		String ret = "";

		for (int i = 0; i < 4; i++) {
			String a = "|";
			ret += a + getStringZahl(puzzle[0][i]) + a + getStringZahl(puzzle[1][i]) + a + getStringZahl(puzzle[2][i])
					+ a + getStringZahl(puzzle[3][i]) + a;
			ret += "\n-------------\n";
		}

		return ret;
	}

	private String getStringZahl(int i) {
		if (i < 10) {
			if (i == 0) {
				return "  ";
			}
			return " " + i;
		}
		return i + "";
	}

}
