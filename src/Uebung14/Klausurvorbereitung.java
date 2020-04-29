package Uebung14;

import java.util.ArrayList;

public class Klausurvorbereitung {

	public static void main(String[] args) {
		int a = 2;
		int b = 23;
		// System.out.println(ackermann(a, b));
		// System.out.println(primZahlTest(Integer.MAX_VALUE));
		System.out.println(getValues("nierui141nknio351314ljlkn4jkl1143lnkln3"));
	}

	// public static int ackermann(int n, int m) {
	// if (n == 0) {
	// return m + 1;
	// }
	// if (m == 0) {
	// return ackermann(n - 1, 1);
	// }
	// return ackermann(n - 1, ackermann(n, m - 1));
	// }

	// public static ArrayList<Integer> getValues(int num) {
	// return getValues(num, 2);
	// }
	//
	// private static ArrayList<Integer> getValues(int num, int fac) {
	// if (num == 1) {
	// return new ArrayList<Integer>();
	// } else if (num % fac == 0) {
	// ArrayList<Integer> ret = getValues(num / fac, fac);
	// ret.add(fac);
	// return ret;
	// } else {
	// return getValues(num, fac + 1);
	// }
	// }

	public static ArrayList<Integer> primZahlTest(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			ret.add(i);
		}
		for (int i = 2; i < (int) Math.sqrt(n); i++) {
			for (int j = 0; j < ret.toArray().length; j++) {
				if (ret.get(j) % i == 0 && ret.get(j) != i)
					ret.remove(j);
			}
		}
		return ret;
	}

	public static ArrayList<Integer> getValues(String s) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			int ascii = s.charAt(i);
			if (ascii >= '1' && ascii <= '9') {
				String hilf = "" + s.charAt(i);
				try {
					while (s.charAt(i + 1) >= '1' && s.charAt(i + 1) <= '9') {
						hilf += s.charAt(i + 1);
						i++;
					}
					ret.add(Integer.parseInt(hilf));
				} catch (StringIndexOutOfBoundsException e) {
					ret.add(Integer.parseInt(hilf));
					return ret;
				}
			}

		}
		return ret;
	}

}
