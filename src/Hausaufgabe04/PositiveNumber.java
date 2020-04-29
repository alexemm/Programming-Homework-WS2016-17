package Hausaufgabe04;

public class PositiveNumber {

	private int value;

	/**
	 * 
	 * @param s
	 * @throws NumberFormatException
	 * 
	 */
	public void setDecimal(String s) throws NumberFormatException {

		int v = Integer.parseInt(s);

		if (v < 0) {
			throw new ArithmeticException("Not a positve number!");
		}
		value = v;

	}

	public void setHexadecimal(String s) throws NumberFormatException{
		int v = 0;
		for (int i = 0; i < s.length(); i++) {
			v += getHexadecimalValue(s.charAt(s.length() - i - 1) + "") * Math.pow(16, i);
		}
		value = v;
	}

	private static int getHexadecimalValue(String s) {
		int tmp = -1;
		try {
			tmp = Integer.parseInt(s);
		} catch (NumberFormatException n) {
		}

		switch (s) {
		case "a":
			return 10;
		case "b":
			return 11;
		case "c":
			return 12;
		case "d":
			return 13;
		case "e":
			return 14;
		case "f":
			return 15;
		}

		if (tmp < 0) {
			throw new ArithmeticException("Not a positive number!");
		}
		return tmp;
	}

	public void setBinary(String s) {
		int v = 0;
		for (int i = 0; i < s.length(); i++) {
			
			v += Integer.parseInt(s.charAt(s.length() - i - 1) + "") * Math.pow(2, i);
		}
		value = v;
	}

	public String getDecimal() {
		return value + "";

	}

	public String getHexadecimal() {
		StringBuilder ret = new StringBuilder();
		int tmp = value;
		while (tmp > 0) {
			ret.insert(0, hexadecimal(tmp % 16));
			tmp /= 16;
		}
		return ret.toString();

	}

	private static String hexadecimal(int s) {
		if (s > 15) {
			throw new NumberFormatException("Not a hexadecimal.");
		}
		if (s < 10 && s >= 0) {
			return s + "";
		}
		if (s < 0) {
			throw new ArithmeticException("Not a positive number!");
		}
		switch (s) {
		case 10:
			return "a";
		case 11:
			return "b";
		case 12:
			return "c";
		case 13:
			return "d";
		case 14:
			return "e";
		case 15:
			return "f";
		}
		return "";
	}

	public String getBinary() {
		StringBuilder ret = new StringBuilder();
		int tmp = value;
		while (tmp > 0) {
			ret.insert(0, tmp % 2);
			tmp /= 2;
		}
		return ret.toString();

	}
}
