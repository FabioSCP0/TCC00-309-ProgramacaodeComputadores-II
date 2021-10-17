package orientacaoAObjetos.q7;

public class Automovel implements IComparavel{
	private String marca;
	private float velocidadeMaxima;
	Automoveis automoveis;
	
	Automovel(String marca, float velocidadeMaxima){
		setMarca(marca);
		setVelocidadeMaxima(velocidadeMaxima);
	}
	
	public String getMarca() {
		return marca;
	}
	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public int compararCom(IComparavel comparavel) {
		if(this.getVelocidadeMaxima()>((Automovel) comparavel).
				getVelocidadeMaxima()) return 1;
		else if(this.getVelocidadeMaxima()==((Automovel) comparavel).
				getVelocidadeMaxima()) return 0;
		else return -1;
			
	}
	
	public String toString() {
		return String.format("O nome do carro é %s, e sua velocidade máxima é %.2f", this.getMarca(),this.getVelocidadeMaxima());
	}
	
}
