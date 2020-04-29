package Langeweile;

import java.util.concurrent.TimeUnit;

public class Uhr {

	
	
	public static void main(String[] args) {
		int counter=Integer.MAX_VALUE;
		while(counter>0) {
		counter--;
		System.out.println(counter);
		try {
			TimeUnit.SECONDS.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
