package Uebung12;

public class IEEE {

	public static void main(String[] args) {
		System.out.println(FloatToIEEE(73.5f));
	}

	public static String FloatToIEEE(float eingabe) {
		String ret = "";
		String eingabeString = "" + eingabe;

		ret += vorzeichenBit(eingabe);
		String m = mantisse(eingabeString.substring(1));
		System.out.println(m);

		int normalisierung = 0;
		while (eingabeString.charAt(normalisierung + 1) != '.') {
			normalisierung++;
		}
		System.out.println(normalisierung);

		String e = exponent(normalisierung, 127);
		System.out.println(e);

		ret += e + m;

		if (ret.length() > 23) {
			ret = ret.substring(0, 24);
		}

		return ret;
	}

	private static String exponent(int normalisierung, int i) {
		return (Integer.toBinaryString(normalisierung + 127));
	}

	private static String mantisse(String s) {
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1.deleteCharAt(s1.indexOf("."));
		if (s1.length() > 23)
			throw new RuntimeException("");
		while (s1.length() < 23) {
			s1.append("0");
		}
		return s1.toString();
	}

	private static String vorzeichenBit(float eingabe) {
		if (eingabe >= 0) {
			return "0";
		} else {
			return "1";
		}
	}
}
