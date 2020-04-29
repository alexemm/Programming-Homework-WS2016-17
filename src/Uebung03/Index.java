package Uebung03;

import java.util.*;

public class Index {

	private HashMap<String, ArrayList<Integer>> index;

	public Index() {
		this.index = new HashMap<String, ArrayList<Integer>>();
	}

	public Index(Index index) {
		this.index = new HashMap<String, ArrayList<Integer>>(index.index);
	}

	public void begriffHinzufuegen(String begriff, int seitenzahl) {

		if (!index.containsKey(begriff)) {
			ArrayList<Integer> neu = new ArrayList<Integer>();
			neu.add(seitenzahl);
			index.put(begriff, neu);
			return;
		}

		ArrayList<Integer> tmp = (ArrayList<Integer>) index.get(begriff);

		if (tmp.contains(seitenzahl)) {
			return;
		}
		tmp.add(seitenzahl);
		index.put(begriff, new ArrayList<Integer>(tmp));
	}

	public String toString() {
		String ret = "";
		for (String s : index.keySet()) {
			String tmp = index.get(s).toString();
			ret += s + ": " + tmp.substring(1, tmp.length() - 1) + " \n";
		}
		return ret;
	}

}
