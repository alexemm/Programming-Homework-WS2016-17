package Uebung03;

public class IndexTest {
	public static void main(String[] args) {
		Index index = new Index();
		index.begriffHinzufuegen("boolean", 1);
		index.begriffHinzufuegen("boolean", 15);
		index.begriffHinzufuegen("boolean", 3);
		index.begriffHinzufuegen("boolean", 15);
		Index index2 = new Index(index);
		index.begriffHinzufuegen("if", 45);
		index.begriffHinzufuegen("if", 2);
		index.begriffHinzufuegen("if", 10);
		index.begriffHinzufuegen("if", 45);
		System.out.println(("index"));
		System.out.println(index);
		System.out.println(("index2"));
		System.out.println(index2);
	}
}
