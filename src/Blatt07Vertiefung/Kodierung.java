package Blatt07Vertiefung;

public class Kodierung {

	private static String table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	public static void main(String[] args) {
		String test = "MALEeN";
		System.out.println(kodieren(test) + "\n" + dekodieren(kodieren(test)));

	}

	public static String kodieren(String text) {

		String kode1 = "";

		for (int i = 0; i < text.length(); i += 3) {

			String bit = text.substring(i, i + 3);

			for (int j = 0; j < bit.length(); j++) {

				int ascii = (int) bit.charAt(j);
				if (ascii < 65) {
					kode1 += 0;
				}
				kode1 += "0" + Integer.toBinaryString(ascii);

			}
		}

		String kode2 = "";

		for (int i = 0; i < kode1.length(); i += 6) {
			String tmp = kode1.substring(i, i + 6);
			kode2 += Integer.parseInt(tmp, 2);
		}

		String kode = "";

		for (int i = 0; i < kode2.length(); i += 2) {
			
			int tmp1 = Integer.parseInt(kode2.substring(i, i + 1));
			int tmp2 = Integer.parseInt(kode2.substring(i + 1, i + 2));
			kode += table.charAt(tmp1 * 10 + tmp2);
		}

		return kode;
	}

	public static String dekodieren(String kode) {
		
		String text1 = "";
		for (int i = 0; i < kode.length(); i++) {

			int zaehler = 0;
			
			while (kode.charAt(i) != table.charAt(zaehler)) {
				zaehler++;
			}
			
			int index = 0;
			
			while (zaehler > 10) {
				zaehler -= 10;
				index++;
			}
			
			if (Integer.parseInt(index + "" + zaehler) < 32) {
				
				text1 += 0;
				
				if (Integer.parseInt(index + "" + zaehler) < 16) {
					
					text1 += 0;
					
					if (Integer.parseInt(index + "" + zaehler) < 8) {
						
						text1 += 0;
						
						if (Integer.parseInt(index + "" + zaehler) < 4) {
							
							text1 += 0;
							
							if (Integer.parseInt(index + "" + zaehler) < 2) {
								
								text1 += 0;
								
								if (Integer.parseInt(index + "" + zaehler) < 1) {
									
									text1 += 0;
								}
							}
						}
					}
				}
			}
			
			text1 += Integer.toBinaryString(Integer.parseInt(index + "" + zaehler));
			
		}

		String text = "";

		for (int i = 0; i < text1.length(); i += 8) {

			String tmp = text1.substring(i, i + 8);
			int tmp2 = Integer.parseInt(tmp, 2);
			text += (char) tmp2;
		}
		
		return text;
	}
}
