package lambdas;

import java.util.function.Function;

/*Function interface define um argumento e define um tipo de retorno via generics*/

public class Funcao {
	public static void main(String[] args) {
		
		/*Function<argumento de entrada, retorno>*/
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(32)+"\n");
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado eh: " + valor;
				
		String resultado = parOuImpar
				.andThen(oResultadoE)
				.apply(32);
		
		System.out.println(resultado);
	}
}
