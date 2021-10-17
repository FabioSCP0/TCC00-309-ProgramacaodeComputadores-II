package orientacaoAObjetos.q7;

public class Test {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Fabio",9);
		Aluno a2 = new Aluno("Andre",10);
		Aluno a3 = new Aluno("Carlos",3);
		Aluno a[] = {a1,a2,a3};
		
		Automovel c1 = new Automovel("Fiat", 300.0f);
		Automovel c2 = new Automovel("Wolks", 400.0f);
		Automovel c[] = {c1,c2};
		
		
		System.out.println(a1.compararCom(a2));
		System.out.println(c1.compararCom(c2));
		
		
		Comparavel.selectionSort(a);
		Comparavel.selectionSort(c);
		
		for(Aluno aluno : a) {
			System.out.println(aluno.toString());
		}
		
		System.out.println("\n");
		for(Automovel automovel : c) {
			System.out.println(automovel.toString());
		}
	}	
}
