package Uebung03;

import java.math.BigInteger;

public class Fakultaet {

	

	public static int berechneFakultaetInteger(int n) {
		if (n == 0)
			return 1;
		return n * berechneFakultaetInteger(n - 1);
	}

	public static long berechneFakultaetLong(long n) {
		if (n == 0)
			return 1;
		return n * berechneFakultaetLong(n - 1);
	}

	public static void teste(int n) {
		System.out.println("Integer:\t" + berechneFakultaetInteger(n));
		System.out.println("Long:\t\t" + berechneFakultaetLong(n));
		System.out.println("BigInteger:\t" + berechneFakultaetBigInteger(n));
		System.out.println("Zahl:\t\t" + n + "\n");
	}

	public static int getMaxIntFakultaet() {
		int n = 1;
		BigInteger iMax = new BigInteger(Integer.MAX_VALUE + "");
		while (berechneFakultaetBigInteger(n).compareTo(iMax) < 0)
			n++;

		return (n - 1);
	}

	public static long getMaxLongFakultaet() {
		int n = 1;
		while (berechneFakultaetLong(n) < Long.MAX_VALUE && berechneFakultaetLong(n) > 0)
			n++;
		return (n - 1);
	}

	public static BigInteger berechneFakultaetBigInteger(int n) {
		BigInteger e = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			BigInteger t = new BigInteger("" + i);
			e = e.multiply(t);
		}
		return e;
	}
}
