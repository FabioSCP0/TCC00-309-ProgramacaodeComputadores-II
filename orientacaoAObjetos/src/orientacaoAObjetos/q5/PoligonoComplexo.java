package orientacaoAObjetos.q5;
import java.util.*;

public class PoligonoComplexo {
	List<Poligono> poligonos = new ArrayList<Poligono>();
	
	public void addPoligonoComplexo(String poligono, double altura, double largura){
		if(poligono.equalsIgnoreCase("circulo")) poligonos.add(new Circulo(largura));
		else if(poligono.equalsIgnoreCase("triangulo")) poligonos.add(new Triangulo(altura,largura));
		else poligonos.add(new Retangulo(altura,largura));
	}
	
	public double area() {
		double acumulador=0;
		for (Poligono search : poligonos) {
			acumulador += search.area();
		}
		return acumulador;
	}
}
