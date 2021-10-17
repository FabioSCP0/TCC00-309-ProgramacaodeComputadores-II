package orientacaoAObjetos.q5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		int qtdPoligonos;
		String poligono;
		double altura;
		double largura;
		
		Scanner entrada = new Scanner(System.in);
		
		Circulo c1 = new Circulo(5);
		Retangulo r1 = new Retangulo(5, 10);
		Triangulo t1 = new Triangulo(5, 10);
		PoligonoComplexo p1 = new PoligonoComplexo();
		
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(t1.area());
	
		System.out.println("Digite a quantidade de poligonos a adicionar ao poligono Complexo: ");
		qtdPoligonos = entrada.nextInt();
		
		for(int i=0;i<qtdPoligonos;i++) {
			System.out.print("Digite o nome do poligono: ");
			poligono = entrada.next();
			System.out.print("Digite a altura: ");
			altura = entrada.nextDouble();
			System.out.print("Digite o comprimento/diametro: ");
			largura = entrada.nextDouble();
			p1.addPoligonoComplexo(poligono, altura, largura);
		}
		System.out.println(p1.area());
	}
}
