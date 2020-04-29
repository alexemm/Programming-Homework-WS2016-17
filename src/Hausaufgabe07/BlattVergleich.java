package Hausaufgabe07;

import java.util.Comparator;

public class BlattVergleich implements Comparator<Blatt> {

	@Override
	public int compare(Blatt arg0, Blatt arg1) {
		// TODO Auto-generated method stub
		int[] modus0 = getModus(arg0);
		int[] modus1 = getModus(arg1);
		
		if (modus0[0] != modus1[0]) {
			return modus0[0] - modus1[0];
		}
		
		try {
			if (modus0[1] == modus1[1]) {
				return modus0[2] - modus1[2];
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			return 0;
		}
		return modus0[1] - modus1[1];
	}

	/**
	 * 
	 * @param Blatt
	 *            arg
	 * @return int-array [hoechste Paarung, Paarung Wert, hoechste dritte Karte falls hoechste Paarung != 1]
	 */
	private int[] getModus(Blatt arg) {
		// TODO Auto-generated method stub
		if (arg.getHand()[0] == arg.getHand()[1] && arg.getHand()[0] == arg.getHand()[2]) {
			return new int[] { 3, arg.getHand()[0], arg.getHand()[0] };
		}
		if (arg.getHand()[0] == arg.getHand()[1]) {

			return new int[] { 2, arg.getHand()[1], arg.getHand()[2] };

		} else if (arg.getHand()[0] == arg.getHand()[2]) {

			return new int[] { 2, arg.getHand()[0], arg.getHand()[1] };

		} else if (arg.getHand()[1] == arg.getHand()[2]) {

			return new int[] { 2, arg.getHand()[1], arg.getHand()[0] };

		}

		return new int[] { 1, arg.getHand()[0] + arg.getHand()[1] + arg.getHand()[2] };
	}

}
