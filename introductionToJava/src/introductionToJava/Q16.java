package introductionToJava;

import java.util.Scanner;

public class Q16 {
    public static void main (String[] arg){

        int n;
        int i;
        int inside = 0;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        n = entry.nextInt();
        float[] num = new float[n];
        for (i=0;i<n;i++){
            num[i] = entry.nextFloat();
            if (num[i] >= 10 && num[i] <= 20){
                inside = inside + 1;
            }
        }
        
        System.out.println(inside+" in");
        System.out.println((n-inside)+" out");
    }
    
}
