package orientacaoAObjetos.q3;

public class Test {
	public static void main(String[] args) {
		Porta p1 = new Porta("Preta", 1, 3, 3);
		Porta p2 = new Porta("Amarela", 1, 4, 4);
		Porta p3 = new Porta("Azul", 1, 5, 5);
		
		/*Casa c1 = new Casa(p1,p2,p3);
		c1.porta1.fecha();
		c1.porta2.fecha();
		c1.porta3.abre();
		c1.pinta("Branco");
		System.out.printf("%d %d \n",c1.quantasPortasEstaoAbertas(), c1.totalDePortas());
		System.out.println(c1.cor);*/
		
		Edificio e1 = new Edificio();
		e1.adicionaPorta(p1);
		e1.adicionaPorta(p2);
		e1.adicionaPorta(p3);
		System.out.printf("%d %d \n", e1.quantasPortasEstaoAbertas(),e1.totalDePortas);
	}
}
