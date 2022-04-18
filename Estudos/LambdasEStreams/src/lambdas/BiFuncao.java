package lambdas;

import java.util.function.BiFunction;
/*Bi Function interface recebe dois parametros e retorna um terceiro parametro*/ 
public class BiFuncao {
	public static void main(String[] args) {
		BiFunction<Double, Double, String> resultado = 
				(n1,n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(5.0, 6.0));
	}
}
