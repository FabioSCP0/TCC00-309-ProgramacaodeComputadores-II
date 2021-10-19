package objectOrientation.q4;

public class Door {
	
	boolean open;
	String color;
	
	double dimensionX;
	double dimensionY;
	double dimensionZ;
	
	Door(String cor, double dimensionX, double dimensionY, double dimensionZ){
		this.color = cor;
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.dimensionZ = dimensionZ;
	}

	void open() {
		open = true;
	}
	
	void close() {
		open = false;
	}
	
	void paint(String s) {
		color = s;
	}
	
	boolean isOpen() {
		return open;
	}
	
}
