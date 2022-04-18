package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		Produto prod = new Produto("Ipad",3235.89,0.13);
		Function<Produto, Double> desconto =  p->p.preco *(1-p.desconto);
		UnaryOperator<Double> imposto = numero -> numero >= 2500 ? numero * 1.085 : numero;
		UnaryOperator<Double> frete = numero -> numero >= 3000? numero + 100.0 : numero + 50.0;
		Function<Double, String> arredondar = numero -> String.format("%.2f", numero);
		UnaryOperator<String> formatar = letras -> "R$ " + letras;
		
		String resultado = desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(prod);
		
		System.out.println("O preço final eh " + resultado);
	}
}
