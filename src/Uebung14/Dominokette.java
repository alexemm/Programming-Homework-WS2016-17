package Uebung14;

import java.util.ArrayList;

public class Dominokette {
	
	
	private ArrayList<Dominostein> domkette;
	
	public Dominokette (Dominostein domstein) {
		domkette = new ArrayList<Dominostein>();
		domkette.add(domstein);
	}
	
	public String toString() {
		String ret = "";
		for (int i = 0; i< domkette.toArray().length;i++) {
			ret+=domkette.get(i)+ " ";
		}
		return ret;
	}
	
	public void fuegeRechtsAn(Dominostein d) {
		int lastindex = domkette.get(domkette.toArray().length-1).getValues()[1] ;
		if ( lastindex == d.getValues()[0]) {
			domkette.add(d);
			return;
		}
		d.dreheUm();
		if ( lastindex == d.getValues()[0]) {
			domkette.add(d);
			return;
		}
		throw new NumberFormatException("Passt anscheinend nicht...");
	}
}
