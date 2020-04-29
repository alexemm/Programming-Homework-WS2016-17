package Hausaufgabe03;

public class MyArrayList {

	private int[] arr = new int[10];
	private int size = 0;

	/**
	 * Haengt ein Element hinten an die Liste an
	 * 
	 * @param i
	 */
	public void add(int i) {
		size++;
		if (size >= arr.length) {
			int[] arr2 = new int[arr.length * 2];
			for (int j = 0; j < size; j++) {
				arr2[j] = arr[j];
			}
			arr = arr2.clone();
		}

		arr[size - 1] = i;
	}

	/**
	 * Gibt das Element an der angegebenen Stelle zurueck.
	 * 
	 * @param pos
	 * @return int-Element an der angegebenen Stelle
	 * @throws ArrayIndexOutOfBoundsException
	 *             falls pos nicht zwischen 0 und size liegt
	 */
	public int get(int pos) {
		if (pos < 0 || pos >= this.size()) {
			throw new ArrayIndexOutOfBoundsException("Zahl liegt nicht im Array");
		}
		return arr[pos];
	}

	/**
	 * Gibt eine Stringdarstellung in der Form [1,2,3,4,7,9] zurueck
	 */
	public String toString() {
		String ret = "[";
		for (int i = 0; i < this.size(); i++) {
			ret += arr[i] + ",";
		}
		String ret2 = "[";
		if (ret.length() > 1) {
			ret2 = ret.substring(0, ret.length() - 1);
		}

		return ret2 + "]";

	}

	/**
	 * Loescht das Feld.
	 */
	public void clear() {
		size = 0;
		arr = new int[10];
	}

	/**
	 * Gibt die Anzahl der aufgenommenen Elemente zurueck.
	 * 
	 * @return Groesse des Feldes
	 */
	public int size() {
		return size;

	}

	/**
	 * Gibt die Groesse des Feldes (einschliesslich freier Elemente) zurueck
	 * 
	 * @return Kapazitaet
	 */
	public int capacity() {
		return arr.length;
	}

	/**
	 * Erzeugt einen Klon der this-Liste.
	 */
	public MyArrayList clone() {
		MyArrayList ret = new MyArrayList();
		for (int i = 0; i < size; i++) {
			ret.add(arr[i]);
		}
		return ret;
	}

	/**
	 * Fuegt ein Element an der Position pos ein. Verschiebt alle folgenden
	 * Elemente eine Position nach hinten.
	 * 
	 * @param i
	 * @param pos
	 * @throws ArrayIndexOutOfBoundsException
	 *             falls pos nicht zwischen 0 und size liegt.
	 */
	public void add(int i, int pos) {

		if (pos < 0 || pos >= size) {
			throw new ArrayIndexOutOfBoundsException("Position ist nicht drinnen!");
		}

		MyArrayList a = new MyArrayList();
		for (int j = 0; j < pos; j++) {
			a.add(this.get(j));
		}
		a.add(i);
		for (int j = pos; j < this.size(); j++) {
			a.add(this.get(j));
		}

		this.clear();

		for (int j = 0; j < a.size(); j++) {
			this.add(a.get(j));
		}
	}

	/**
	 * Loescht das Element an der Position pos. Verschiebt alle folgenden
	 * Elemente eine Position nach vorne
	 * 
	 * @param pos
	 * @throws ArrayIndexOutOfBoundsException
	 *             falls pos nicht zwischen 0 und size liegt
	 */
	public void delete(int pos) {
		int i = this.capacity();
		if (this.size() <= i / 3 + 1) {
			if (this.capacity() % 2 != 0) {
				i = (this.capacity() / 2) + 1;
			} else {
				i = this.capacity() / 2;
			}
		}

		MyArrayList a = new MyArrayList();
		for (int j = 0; j < this.size(); j++) {
			if (j == pos) {
				continue;
			}
			a.add(this.get(j));
		}
		this.clear();
		for (int j = 0; j < a.size; j++) {
			this.add(a.get(j));
		}

		if (this.capacity() != i) {
			int[] arr2 = new int[i];
			for (int j = 0; j < this.size(); j++) {
				arr2[j] = arr[j];
			}
			arr = arr2.clone();
		}
	}

}
