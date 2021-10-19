package introductionToJava;

import java.util.Scanner;

public class Q14 {
    public static void main (String arg[]){

        int i = 1;
        int num;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
        num = entry.nextInt();
        
        do{
            System.out.println(i);
            i=i+2;
        }while (i<=num);
    }
}
