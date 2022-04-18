package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		
		caixaA.guardar(2.3);
		caixaB.guardar(2);
	}
}
