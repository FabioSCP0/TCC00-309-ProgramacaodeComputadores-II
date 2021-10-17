package orientacaoAObjetos.q3;

public abstract class Imovel {
	
	String cor;
	
	void pinta(String s) {
		this.cor = s;
	}
	
	abstract int totalDePortas();
	abstract int quantasPortasEstaoAbertas();
	

}
