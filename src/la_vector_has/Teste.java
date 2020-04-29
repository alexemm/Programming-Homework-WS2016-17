package la_vector_has;

public class Teste {
	public static void main(String[] args) {
		double[] d1 = { 3, 1, 4 };
		double[] d2 = {42,88,69,666};
		
		VectorRn v1 = new VectorRn(d2);
		
		System.out.println(arrayToString(v1.bestimmeSenkrechteVektoren()));
		check(v1.bestimmeSenkrechteVektoren(),v1);
	}

	public static String arrayToString(VectorRn[] v) {
		String s = "";
		for (int i=0; i<v.length;i++) {
			s+=v[i] + "\n";
		}
		return s;
	}
	
	public static void check(VectorRn[] v, VectorRn vi) {
		for (int i=0;i<v.length;i++) {
			System.out.println(VectorRn.scalarProd(v[i], vi));
		}
	}
}
