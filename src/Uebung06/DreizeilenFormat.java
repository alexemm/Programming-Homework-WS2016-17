package Uebung06;

public class DreizeilenFormat implements BruchFormat {

	@Override
	public String bruchToString(int zaehler, int nenner) {

		String s = "";
		int laenge = ("" + nenner).length();
		s += ("%." + laenge + "s " + zaehler + "\n");
		
		if ((nenner + "").length() > laenge) {
			laenge = (nenner + "").length();
		}
		
		for (int i = 0; i < laenge; i++) {
			s += "-";
		}
		
		s += ("\n" + nenner);
		return s;
	}

}
