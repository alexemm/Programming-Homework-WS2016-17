package Hausaufgabe06;

public class GefDilemma {

	GefStrategie a;
	GefStrategie b;

	public GefDilemma(GefStrategie a, GefStrategie b) {
		this.a = a;
		this.b = b;
	}

	public void spiele(int n) {
		int aStraf = 0;
		int bStraf = 0;
		for (int i = 0; i < n; i++) {
			if (a.getNextDecision() && b.getNextDecision()) {
				aStraf += 2;
				bStraf += 2;
			} else if (!a.getNextDecision() && !b.getNextDecision()) {
				aStraf += 4;
				bStraf += 4;
			} else if (!a.getNextDecision() && b.getNextDecision()) {
				aStraf += 0;
				bStraf += 5;
			} else if (a.getNextDecision() && !b.getNextDecision()) {
				aStraf += 5;
				bStraf += 0;
			}

			a.setOpponentsLastDecision(b.getNextDecision());
			b.setOpponentsLastDecision(a.getNextDecision());
		}
		System.out.println("Spieler a: " + aStraf + "\nSpieler b: " + bStraf);
	}
}
