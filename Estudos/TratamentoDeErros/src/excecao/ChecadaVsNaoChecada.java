package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("Fim");
	}
	
	// Não checada ou não verificada
	private static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro #01!");
		
	}
	
	// Exceção checada ou verificada (é necessario tratar o erro)
	private static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro #02!");
		
	}


}
