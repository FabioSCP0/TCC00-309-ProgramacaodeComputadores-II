package orientacaoAObjetos.q5;

public class Retangulo extends Poligono{
	
	Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura * largura;
	}

}
