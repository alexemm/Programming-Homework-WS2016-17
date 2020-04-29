package Hausaufgabe12;

import java.io.File;

public class Testfall {
public static void main(String[] args) {
	File f = new File("bin/Hausaufgabe12/message.txt");
//	System.out.println(f.getAbsolutePath());
	System.out.println(Huffman.decode(f));
}
}
