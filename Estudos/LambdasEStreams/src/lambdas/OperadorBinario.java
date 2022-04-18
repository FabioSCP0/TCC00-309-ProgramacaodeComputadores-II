package lambdas;

import java.util.function.BinaryOperator;

/*Binary Operator interface recebe dois argumentos do mesmo tipo definido por generics e retorna um argumento manipulado*/
public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x,y) ->{return x+y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x,y) ->{return x+y;};
		System.out.println(calc2.apply(3, 3)); 
	}
}
