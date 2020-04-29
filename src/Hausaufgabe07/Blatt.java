package Hausaufgabe07;

public class Blatt {

	private int[] hand = new int[3];

	public Blatt(int[] hand) {
		this.hand = hand.clone();
	}

	public String toString() {
		return hand[0] + ", " + hand[1] + ", " + hand[2];
	}
	
	public int[] getHand() {
		return hand.clone();
	}
}
