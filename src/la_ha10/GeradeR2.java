package la_ha10;

/**
 * Gerade im R2, gilt besitzt die Methoden einer Hyperebene und hat
 * AbstrakteEbene als Superklasse
 * 
 * @author Alexander E.
 *
 */
public class GeradeR2 extends AbstrakteEbene implements Hyperebene {

	private VektorRn normalenVektor;
	private VektorRn richtungsVektor;
	private Punkt aufpunkt;

	/**
	 * Konstruktor mit 2 Punkten, wodurch man eine Gerade konstruieren kann
	 * 
	 * @param p1
	 * @param p2
	 */
	public GeradeR2(Punkt p1, Punkt p2) {
		aufpunkt = p1;
		richtungsVektor = getRichtungsvektor(p1, p2);
		normalenVektor = getNormalenvektorR2(richtungsVektor);
	}

	/**
	 * Konstruktor durch Normalenvektor und Punkt in Gerade
	 * 
	 * @param v1
	 *            - Normalenvektor
	 * @param p1
	 *            - Punkt in Gerade
	 */
	public GeradeR2(VektorRn v1, Punkt p1) {
		normalenVektor = v1;
		richtungsVektor = getNormalenvektorR2(v1);
		aufpunkt = p1;
	}

	/**
	 * Statische Methode zur Ermittlung vom Normalenvektor
	 * 
	 * @param v1
	 * @return Normalenvektor
	 */
	private static VektorRn getNormalenvektorR2(VektorRn v1) {
		VektorRn ret = new VektorRn(2);
		double hilf = v1.getElement(0);
		ret.setElement(0, v1.getElement(1));
		ret.setElement(1, -hilf);
		return ret;
	}

	@Override
	public VektorRn getNormalenvektor() {
		return normalenVektor;
	}

	@Override
	public String getNormalform() {
		String normalenform = "" + this.getNormalenvektor().getElement(0) + "x + "
				+ this.getNormalenvektor().getElement(1) + "y = "
				+ VektorRn.scalarProd(this.getNormalenvektor(), aufpunkt.getVektorRn());
		return normalenform;
	}

	/**
	 * Statische Methode zur Konstruktion von Richtungsvektor aus zwei Punkten
	 * 
	 * @param v1
	 * @param v2
	 * @return R
	 */
	public static VektorRn getRichtungsvektor(Punkt p1, Punkt p2) {
		VektorRn richtungsVektor = p1.getVektorRn().add(p2.getVektorRn().mult(-1));
		return richtungsVektor;
	}

}
