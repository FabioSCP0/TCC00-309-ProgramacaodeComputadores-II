package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		Consumer<Integer> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> binario = p->Integer.toBinaryString(p);
		UnaryOperator<String> inver = p-> new StringBuilder(p)
				.reverse()
				.toString();
		Function<String, Integer> inteiro = p->Integer.parseInt(p,2);
		
		nums.stream()
			.map(binario)
			.map(inver)
			.map(inteiro)
			.forEach(println);
		
	}
}
