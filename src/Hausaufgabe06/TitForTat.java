package Hausaufgabe06;

public class TitForTat implements GefStrategie{

	private boolean firstTurn;
	private boolean opponentsLastDecision;
	
	public TitForTat() {
		firstTurn = true;
	}
	
	@Override
	public boolean getNextDecision() {
		if (firstTurn) {
			firstTurn = false;
			return true;
		}
		return opponentsLastDecision;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		opponentsLastDecision = decision;
		
	}

}
