package introductionToJava;

import java.util.Scanner;
public class Q15 {
    public static void main (String arg[]){

        int i;
        int number;
        int end;
        int smaller;
        int bigger;
        int soma=0;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        smaller = entry.nextInt();
        bigger = entry.nextInt();
        if (smaller>bigger){
            end = smaller;
            smaller = bigger;
            bigger = end;
        }
        if (smaller != bigger){
            if (smaller%2 == 0){
                number = smaller + 1;
            }
            else{
                number = smaller+2;
            }
            if (bigger%2 == 0){
                end = bigger - 1;
            }
            else {
                end = bigger-2;
            }
            for (i=number;i<=end;i=i+2){
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
