package orientacaoAObjetos.q3;

public class Casa extends Imovel{
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	Casa(Porta p){
		this.porta1 = p;
	}
	
	Casa(Porta p, Porta p2){
		this.porta1 = p;
		this.porta2 = p2;
	}
	
	Casa(Porta p,Porta p2, Porta p3){
		this.porta1 = p;
		this.porta2 = p2;
		this.porta3 = p3;
	}
	
	@Override
	int totalDePortas() {
		if(porta1 instanceof Porta) {
			if((porta2 instanceof Porta)&&(porta3 instanceof Porta)) return 3;
			else if(!(porta2 instanceof Porta)&&(porta3 instanceof Porta)) return 2;
			else if((porta2 instanceof Porta)&&!(porta3 instanceof Porta)) return 2;
			else return 1;
		}else if(porta2 instanceof Porta) {
			if(porta3 instanceof Porta) return 2;
			else return 1;
		}else if(porta3 instanceof Porta) {
			return 1;
		}
		else return 0;
	}

	@Override
	int quantasPortasEstaoAbertas() {
		int acumulador = 0;
		if((porta1 instanceof Porta)&&(porta1.estaAberta())) acumulador++;
		if((porta2 instanceof Porta)&&(porta2.estaAberta())) acumulador++;
		if((porta3 instanceof Porta)&&(porta3.estaAberta())) acumulador++;
		return acumulador;
	}
	
}
