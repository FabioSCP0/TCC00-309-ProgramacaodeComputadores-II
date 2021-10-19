package introductionToJava;

import java.util.Scanner;

public class Q13 {
    public static void main (String arg[]){

        int[] numbers = new int [5];
        int pair = 0;
        int unpaired = 0;
        int negative = 0;
        int positive = 0;

    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        for (int i=0;i<numbers.length;i++){
            numbers[i] = entry.nextInt();
            if (numbers[i]<0){
                negative = negative + 1;
            }
            else{
                if (numbers[i]>0){
                    positive = positive+1;
                }
            }
            if (numbers[i]%2 == 0){
                pair = pair+1;
            }
            else{
                unpaired = unpaired+1;
            }
        }
        System.out.println (pair+" valor(es) par(es)");
        System.out.println (unpaired+" valor(es) impar(es)");  
        System.out.println (positive+" valor(es) positivo(s)");
        System.out.println (negative+" valor(es) negativo(s)"); 
    }
}
