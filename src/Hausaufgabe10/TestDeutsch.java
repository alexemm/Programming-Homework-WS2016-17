package Hausaufgabe10;

/**
 * Testklasse deutsch.
 */
public class TestDeutsch {
	public static void main(String[] kommandozeile) {
		int[] test = new int[10000];
		for (int i = 1;i<10000;i++) {
			test[i]=i;
		}
		int[] testtabelle = {1, 10, 11, 12, 16, 17, 20, 38, 69, 70,103, 131, 195, 2345};
		for (int zahl : test) {
			try {
				ZahlwortDeutsch zahlwort = new ZahlwortDeutsch(zahl);
				System.out.println(zahlwort);
			} catch (NumberFormatException ex) {
				System.out.println(ex);
			}
		}
	}
}