package objectOrientation.q5;

public class Circle extends Polygon{
	Circle(double diameter){
		this.height = diameter/2;
		this.width = diameter;
	}

	@Override
	public double area() {
		return Math.PI * height;
	}
}
