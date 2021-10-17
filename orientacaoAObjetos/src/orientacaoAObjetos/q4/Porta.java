package orientacaoAObjetos.q4;

public class Porta {
	
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	void abre() {
		aberta = true;
	}
	
	void fecha() {
		aberta = false;
	}
	
	void pinta(String s) {
		cor = s;
	}
	
	boolean estaAberta() {
		return aberta;
	}
	
}
