package Uebung03;

public class FakultaetTest {
	public static void main(String[] args) {
		int[] test = { 0, 1, 5, 10, 20, 50, 100, 1000 };
		for (int i = 0; i < test.length; i++) {
			Fakultaet.teste(test[i]);
		}
		System.out.println(Fakultaet.getMaxIntFakultaet());
		System.out.println(Fakultaet.getMaxLongFakultaet());

	}
}
