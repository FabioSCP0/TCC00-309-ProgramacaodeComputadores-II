package introductionToJava;

import java.util.Scanner;

public class Q26 {
    public static void main(String arg[]){
    	
        int[]par = new int[5];
        int[]impar = new int[5];
        int num;
        int i = 0;
        int j = 0;
        int k = 0;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
    	
        do{
            num = entry.nextInt();
            if (num%2 == 0){
                par[i] = num;
                i=i+1;
                k=k+1;
                if (i==5){
                    for (i=0;i<5;i++){
                        System.out.println("par["+i+"] = "+par[i]);
                        par[i]=0;
                    }
                    i=0;
                }
            }
            else{
                impar[j] = num;
                j=j+1;
                k=k+1;
                if (j==5){
                    for (j=0;j<5;j++){
                        System.out.println("impar["+j+"] = "+impar[j]);
                        impar[j]=0;
                    }
                    j=0;
                }
            }
        }while (k<15);
        for (j=0;j<5;j++){
            if (impar[j] != 0){
                System.out.println("impar["+j+"] = "+impar[j]);
            }
        }
        for (i=0;i<5;i++){
            if (par[i] != 0){
                System.out.println("par["+i+"] = "+par[i]);
            }
        }
    }
    
}
