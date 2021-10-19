package introductionToJava;

import java.util.*;
public class Q18 {
    public static void main (String arg[]){
    	
        int n = 0;
        int i = 0;
        int bigger = 0;
        int biggerPosition = 0;
        int[] num = new int[100];
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
    	
        do{
            n = entry.nextInt();
            num[i] = n;
            if (n>bigger){
                bigger = n;
                biggerPosition = i;
            }
            i=i+1;
        }while (i<100);
      
        System.out.println(bigger);
        System.out.println(biggerPosition);
    }
}
