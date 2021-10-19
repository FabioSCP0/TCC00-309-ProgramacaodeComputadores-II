package objectOrientation.q5;

public class Triangle extends Polygon{
	
	Triangle(double height, double largura){
		this.height = height;
		this.width = largura;
	}
	
	@Override
	public double area() {
		return (height * width)/2;
	}
}
