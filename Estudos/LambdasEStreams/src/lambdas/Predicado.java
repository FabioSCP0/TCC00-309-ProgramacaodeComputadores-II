package lambdas;

import java.util.function.Predicate;

/* Predicate interface recebe um argumento e retorna um boolean*/

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco *(1-prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3800.10,0.15);
		System.out.println(isCaro.test(produto));
	}
}