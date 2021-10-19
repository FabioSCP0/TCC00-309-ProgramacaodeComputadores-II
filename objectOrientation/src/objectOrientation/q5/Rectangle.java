package objectOrientation.q5;

public class Rectangle extends Polygon{
	
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}

}
