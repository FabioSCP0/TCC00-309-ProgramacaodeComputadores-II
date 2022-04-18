package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*Supplier interface não recebe nunhum parametro e retorna (ou fornece) um tipo*/

public class Fornecedor {
	public static void main(String[] args) {
	 	Supplier<List<String>>umaLista = 
				()->Arrays.asList("Ana","Lia","Gui");
		System.out.println(umaLista.get()); 
	} 
}
