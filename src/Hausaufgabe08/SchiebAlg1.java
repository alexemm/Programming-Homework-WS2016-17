package Hausaufgabe08;

public class SchiebAlg1 implements Loesungsalgorithmus {

	@Override
	public void loese(Schiebepuzzle puzzle) {

		while (!(puzzle.getPosX(1) == 0 && puzzle.getPosY(1) == 0)) {
			try {
				puzzle.schiebe((int) (Math.random() * 15 + 1));
			} catch (WrongMoveException w) {

			}
		}
	}

}
