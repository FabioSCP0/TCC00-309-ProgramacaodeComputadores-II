package orientacaoAObjetos.q5;

public class Triangulo extends Poligono{
	
	Triangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double area() {
		return (altura * largura)/2;
	}
}
