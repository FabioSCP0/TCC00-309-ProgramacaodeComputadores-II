package objectOrientation.q5;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		int amountPolygons;
		String polygon;
		double height;
		double width;
		
		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);
		
		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(5, 10);
		Triangle t1 = new Triangle(5, 10);
		ComplexPolygon p1 = new ComplexPolygon();
		
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(t1.area());
	
		System.out.println("Digite a quantidade de poligonos a adicionar ao poligono Complexo: ");
		amountPolygons = entry.nextInt();
		
		for(int i=0;i<amountPolygons;i++) {
			System.out.print("Digite o nome do poligono: ");
			polygon = entry.next();
			System.out.print("Digite a altura: ");
			height = entry.nextDouble();
			System.out.print("Digite o comprimento/diametro: ");
			width = entry.nextDouble();
			p1.addPoligonoComplexo(polygon, height, width);
		}
		System.out.println(p1.area());
	}
}
