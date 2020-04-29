package Hausaufgabe06;

public class Spite implements GefStrategie{

	private boolean inSpite;
	
	public Spite() {
		inSpite = false;
	}
	
	@Override
	public boolean getNextDecision() {
		if (inSpite) {
			return false;
		}
		return true;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		if (decision == false) {
			inSpite = true;
		}
		
	}

}
