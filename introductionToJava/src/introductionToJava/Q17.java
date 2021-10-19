package introductionToJava;

import java.util.Scanner;

public class Q17 {
    public static void main (String[] arg){

        int n;
        int i;

        @SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	n = entry.nextInt();
    	
        int[] number = new int[n];
        String[] type = new String[n];
    	 
        for (i=0;i<n;i++){
            number[i] = entry.nextInt();
            if (number[i] == 0){
                type [i] = "NULL";
            }
            else{ 
                if (number[i]%2 == 0){
                    type[i] = "EVEN ";
                }
                else{
                    type[i] = "ODD ";
                }
                if (number[i] < 0){
                    type[i] = type[i] + "NEGATIVE";
                }
                else{
                    type[i] = type[i] + "POSITIVE";
                }
            }
        }
        for (i=0;i<n;i++){
            System.out.println(type[i]);
        }
    }
    
}
