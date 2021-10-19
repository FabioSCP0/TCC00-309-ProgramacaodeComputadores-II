package introductionToJava;

import java.util.Scanner;

public class Q03 {
    public static void main (String [] arg){

        float number;
        
        @SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
        number = entry.nextFloat();
        
        if (number < 0 || number > 100){
            System.out.println("Fora de intervalo");
        }
        if (number >= 0 && number <= 25){
            System.out.println ("Intervalo [0,25]");
        } 
        if (number > 25 && number <= 50){
            System.out.println ("Intervalo (25,50]");
        }
        if (number > 50 && number <= 75){
            System.out.println ("Intervalo (50,75]");
        }
        if (number > 75 && number <= 100){
            System.out.println ("Intervalo (75,100]");
        }
    }
}
