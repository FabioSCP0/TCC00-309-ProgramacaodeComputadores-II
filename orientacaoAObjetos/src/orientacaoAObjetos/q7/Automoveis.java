package orientacaoAObjetos.q7;
import java.util.*;
public class Automoveis {
	int maxAutomoveis;
	int numAutomoveis=0;
	
	List<Automovel> automovels = new ArrayList<Automovel>();
	void addAltomovel(Automovel automovel) {
		numAutomoveis++;
		automovels.add(automovel);
		automovel.automoveis = this;	
	}
}
