package Langeweile;

import javax.swing.JOptionPane;

public class Glueck {

	public static void main(String[] args) {
		System.out.println(gluecksAlgorithmus(JOptionPane.showInputDialog("Was macht dich ungluecklich?")));
	}

	public static String gluecksAlgorithmus(String wasDichUngluecklichMacht) {
		return "Bier macht dich gluecklicher";
	}

}
