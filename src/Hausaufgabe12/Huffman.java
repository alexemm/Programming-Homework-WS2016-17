package Hausaufgabe12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Huffman {

	public static String decode(File f) {
		Scanner sc;
		
		HashMap<Character,String> keys;
		try {
			sc = new Scanner(f);
			
			checkFormat(new Scanner(f));
			
			keys = receiveKeys(new Scanner(f));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	private static HashMap<Character, String> receiveKeys(Scanner scanner) {
		HashMap<Character, String> ret = new HashMap<Character,String>();
		
		return ret;
	}

	private static void checkFormat(Scanner sc) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		
	}
}
