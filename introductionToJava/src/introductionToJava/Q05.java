package introductionToJava;

import java.util.Scanner;

public class Q05 {
        public static void main(String arg[]){
        	
        int[] vetor = new int[3];
        int[] index = new int[3];
        int number;
        
        @SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
        for (int i=0;i<vetor.length;i++){
            number = entry.nextInt();
            vetor[i] = number;
            index[i] = number;
        }
        for (int j=1; j<vetor.length;j++){
            for (int i=1 ; i<vetor.length;i++){
                if (index[i] < index[i-1]){
                    number = index[i-1];
                    index[i-1] = index[i];
                    index[i]=number;
                }
            }
        }
        for (int i=0;i<index.length;i++){
            System.out.println(index[i]);
        }
        System.out.println("");
        for (int i=0;i<index.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
