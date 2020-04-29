package Hausaufgabe06;

public class Random implements GefStrategie {

	@Override
	public boolean getNextDecision() {
		if ((int) (Math.random() * 2) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
	}

}
