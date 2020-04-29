package Hausaufgabe06;

public class PerKind implements GefStrategie {

	int counter;

	public PerKind() {
		counter = 0;
	}

	@Override
	public boolean getNextDecision() {
		if (counter % 3 == 2) {
			return false;
		}
		return true;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		counter++;
	}

}
