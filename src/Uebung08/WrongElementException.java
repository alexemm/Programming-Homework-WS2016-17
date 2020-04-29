package Uebung08;


public class WrongElementException extends Exception {

	int errorIndex;

	public WrongElementException(int index) {
		super("Wrong data element in <" + index + ">");
		errorIndex = index;
	}

	public String getIndex() {
		return "Wrong data element in <" + errorIndex + ">";
	}

}
