package orientacaoAObjetos.q5;

public class Circulo extends Poligono{
	Circulo(double diametro){
		this.altura = diametro/2;
		this.largura = diametro;
	}

	@Override
	public double area() {
		return Math.PI * altura;
	}
}
