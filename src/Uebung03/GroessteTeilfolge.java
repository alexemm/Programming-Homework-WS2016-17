package Uebung03;

public class GroessteTeilfolge {

	public static double[] getMaxTeilfolge(double[] x) {
		double[] ret;
		double biggestSum = Integer.MIN_VALUE;
		int anfIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < x.length; i++) {
			int tmpSum = 0;
			for (int j = i; j < x.length; j++) {
				tmpSum += x[j];
				if (tmpSum > biggestSum) {
					biggestSum = tmpSum;
					anfIndex = i;
					endIndex = j;
				}
			}
		}

		ret = new double[endIndex - anfIndex + 1];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = x[anfIndex + i];
		}
		System.out.println(biggestSum);
		return ret;
	}

}
