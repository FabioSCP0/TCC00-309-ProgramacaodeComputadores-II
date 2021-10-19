package objectOrientation.q5;
import java.util.*;

public class ComplexPolygon {
	List<Polygon> poligonos = new ArrayList<Polygon>();
	
	public void addPoligonoComplexo(String poligono, double altura, double largura){
		if(poligono.equalsIgnoreCase("circulo")) poligonos.add(new Circle(largura));
		else if(poligono.equalsIgnoreCase("triangulo")) poligonos.add(new Triangle(altura,largura));
		else poligonos.add(new Rectangle(altura,largura));
	}
	
	public double area() {
		double acumulador=0;
		for (Polygon search : poligonos) {
			acumulador += search.area();
		}
		return acumulador;
	}
}
