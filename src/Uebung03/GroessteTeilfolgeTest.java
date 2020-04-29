package Uebung03;

import java.util.Arrays;

public class GroessteTeilfolgeTest {
	public static void main(String[] args) {
		double[] x= {-2,3,1,-5,-30000,1000,-20000,3,4,1,-2,-3,4};
		System.out.println(Arrays.toString(GroessteTeilfolge.getMaxTeilfolge(x)));	}
}
