package Uebung06;
public class DoubleFormat implements BruchFormat {

	@Override
	public String bruchToString(int zaehler, int nenner) {
		double x = zaehler;
		return ("" + x / nenner);
	}

}
