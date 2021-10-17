package orientacaoAObjetos.q3;

public class Edificio extends Imovel {
	
	int totalDePortas=0;
	int totalDeAndares=0;
	Porta portas[] = new Porta[1];
	
	int totalDeAndares() {
		return totalDeAndares;
	}
	
	void adicionarAndar() {
		totalDeAndares++;
	}
	
	void adicionaPorta(Porta p) {
		if(totalDePortas == 0) {
			totalDePortas++;
			portas[0] = p;
		}else {
			totalDePortas++;
			Porta temp[] = new Porta[totalDePortas];
			for(int i=0;i<totalDePortas-1;i++) {
				temp[i] = portas[i];
			}
			temp[totalDePortas-1] = p;
			portas = temp;
		}
	}
	

	@Override
	int totalDePortas() {
		return totalDePortas;
	}
	
	@Override
	int quantasPortasEstaoAbertas() {
		int acumulador=0;
		for(int i=0;i<totalDePortas;i++) {
			if(portas[i].estaAberta()) acumulador++;
		}
		return acumulador;
	}
}
