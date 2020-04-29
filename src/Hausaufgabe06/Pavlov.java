package Hausaufgabe06;

public class Pavlov implements GefStrategie {

	private boolean firstTurn;
	private boolean opponentsLastDecision;
	private boolean myLastDecision;

	public Pavlov() {
		firstTurn = true;
	}

	@Override
	public boolean getNextDecision() {
		if (firstTurn) {
			myLastDecision = true;
			return myLastDecision;
		}
		if (myLastDecision == opponentsLastDecision) {
			myLastDecision = true;
			return myLastDecision;
		}
		myLastDecision = false;
		return myLastDecision;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		opponentsLastDecision = decision;
	}

}
