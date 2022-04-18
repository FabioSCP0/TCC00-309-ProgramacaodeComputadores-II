package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapa {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		UnaryOperator<String> maiuscula = n->n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n->n.charAt(0)+"";
		UnaryOperator<String> grito = n->n+"!!!";
		
		List<String> marcas = Arrays.asList("BMW ","Audi ","Honda ");
		
		marcas.stream()
			.map(maiuscula)
			.forEach(print);
		
		System.out.println("\n\nUsando composição");
		marcas.stream() //[BMW, Audi, Honda]
			.map(maiuscula) // [BMW, AUDI, HONDA]
			.map(primeiraLetra) //[B, A, H]
			.map(grito)	//[B!!,A!!,H!!]
			.forEach(print);
	}
}
