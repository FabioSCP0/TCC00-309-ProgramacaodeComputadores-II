package objectOrientation.q4;

public abstract class Property {
	
	String cor;

	void paint(String s) {
		this.cor = s;
	}
	
	abstract int totalOfDoors();
	abstract int howManyDoorsAreOpen();
	

}
