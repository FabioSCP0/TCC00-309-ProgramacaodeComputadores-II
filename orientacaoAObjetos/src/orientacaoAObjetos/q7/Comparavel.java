package orientacaoAObjetos.q7;

public class Comparavel {
	private Comparavel() {}
	
	public static void insertionSort(IComparavel[] comparavel){
		//InsertionSort
		if(comparavel[0] instanceof Aluno) {
		    int n = comparavel.length;  
		    for (int j = 1; j < n; j++) {  
		    	IComparavel key = comparavel[j];  
		        int i = j-1;  
		        while ( (i > -1) && ( ((Aluno) comparavel[i]).getNota()<((Aluno) key).getNota())) {  
		        	comparavel [i+1] = comparavel [i];  
		            i--;  
		        }  
		        comparavel[i+1] = key;  
		    } 
		}else {
		    int n = comparavel.length;  
		    for (int j = 1; j < n; j++) {  
		    	IComparavel key = comparavel[j];  
		        int i = j-1;  
		        while ( (i > -1) && ( ((Automovel) comparavel[i]).getVelocidadeMaxima()<((Automovel) key).getVelocidadeMaxima()) ) {  
		        	comparavel [i+1] = comparavel [i];  
		            i--;  
		        }  
		        comparavel[i+1] = key;  
		    } 
		}
	}

	public static void selectionSort(IComparavel[] comparavel) {
		if(comparavel[0] instanceof Aluno) {
	        for (int i = 0; i < comparavel.length-1; i++){  
	            int index = i;  
	            for (int j = i + 1; j < comparavel.length; j++){  
	                if ((((Aluno) comparavel[j]).getNota() > ((Aluno) comparavel[index]).getNota())){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            IComparavel menorValor = comparavel[index];   
	            comparavel[index] = comparavel[i];  
	            comparavel[i] = menorValor;  
	        }
		}else {
	        for (int i = 0; i < comparavel.length; i++){  
	            int index = i;  
	            for (int j = i + 1; j < comparavel.length; j++){  
	                if (((Automovel) comparavel[j]).getVelocidadeMaxima() > ((Automovel) comparavel[index]).getVelocidadeMaxima()){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            IComparavel menorValor = comparavel[index];   
	            comparavel[index] = comparavel[i];  
	            comparavel[i] = menorValor;  
	        }
		}
	}

	public static void bubbleSort(IComparavel[] comparavel) {
		if(comparavel[0] instanceof Aluno) {
	        int n = comparavel.length;  
	        IComparavel temp;  
	         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){
                	 if ((((Aluno) comparavel[j-1]).getNota()<((Aluno) comparavel[j]).getNota())) {
                         temp = comparavel[j-1];  
                         comparavel[j-1] = comparavel[j];  
                         comparavel[j] = temp;  
                	 }
                          
                 }
	         }
		}else{
	        int n = comparavel.length;  
	        IComparavel temp;  
	         for(int i=0; i < n; i++){  
           		for(int j=1; j < (n-i); j++){
                	 if (((Automovel) comparavel[j-1]).getVelocidadeMaxima() < ((Automovel) comparavel[j]).getVelocidadeMaxima()) {
                         temp = comparavel[j-1];  
                         comparavel[j-1] = comparavel[j];  
                         comparavel[j] = temp;  
                	 }
                          
                 }
	         }
		}
	}

}
