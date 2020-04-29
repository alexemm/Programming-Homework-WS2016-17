package Uebung08;

import java.util.ArrayList;

public class NewArrayList extends ArrayList {

	private ArrayList<Object> list = new ArrayList<Object>();

	public NewArrayList() {
		super();
	}
	
	public void add(String x) {
		Integer y;
		Double z;
		try {
			if (x.indexOf(".") != -1) {
				z = Double.parseDouble(x);
				list.add(z);
			} else {
				y = Integer.parseInt(x);
				list.add(y);
			}
		} catch (NumberFormatException n) {
			list.add(x);
			return;
		}
	}

	public void add(int x) {
		Integer y = x;
		list.add(y);
	}

	public void add(double x) {
		Double y = x;
		list.add(y);
	}

	public ArrayList<Integer> getIntegers() {

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < list.toArray().length; i++) {

			String classname = list.get(i).getClass().getName();
			if (classname == "java.lang.Integer") {
				ret.add((Integer) list.get(i));
			}
		}
		return ret;
	}

	public ArrayList<Double> getDoubles() {
		ArrayList<Double> ret = new ArrayList<Double>();
		for (int i = 0; i < list.toArray().length; i++) {

			String classname = list.get(i).getClass().getName();
			if (classname == "java.lang.Double") {
				ret.add((Double) list.get(i));
			}
		}
		return ret;
	}

	public ArrayList<String> getStrings() throws WrongElementException {
		
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < list.toArray().length; i++) {

			String classname = list.get(i).getClass().getName();
			if (classname == "java.lang.String" || classname == "java.lang.Double"
					|| classname == "java.lang.Integer") {

				if (classname == "java.lang.Double" || classname == "java.lang.Integer") {
					ret.add(list.get(i) + "");
				}
				
				if (classname == "java.lang.String") {
					ret.add((String) list.get(i));
				}

			} else {
				throw new WrongElementException(i);
			}
		}
		return ret;
	}
}
